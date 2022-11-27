##Q1
CREATE OR REPLACE VIEW Exceptions AS
SELECT artist_name, album_name
FROM artists, albums albumview
WHERE artist_id NOT IN (SELECT artist_id
FROM album_artist
WHERE album_id = albumview.album_id)
AND artist_id IN (SELECT artist_id
FROM song_artist WHERE song_id IN 
(SELECT song_id FROM song_album WHERE album_id = albumview.album_id));

##Q2
CREATE VIEW album_len AS
SELECT album_name , ROUND(SUM( songs.song_length), 2) AS album_len

FROM song_album
JOIN songs USING (song_id)
JOIN albums USING (album_id)

GROUP BY album_name;

CREATE OR REPLACE VIEW albuminfo AS
SELECT albums.album_name, GROUP_CONCAT(DISTINCT artist_name) AS list_of_artist, albums.date_of_release, 
album_len.album_len AS total_length

FROM song_album
JOIN songs USING (song_id)
JOIN albums USING (album_id)
JOIN album_artist USING (album_id)
JOIN artists USING (artist_id)
JOIN album_len USING (album_name)
GROUP BY album_id;


##Q3
DELIMITER //
CREATE TRIGGER CheckReleaseDate

AFTER INSERT ON song_album
    FOR EACH ROW BEGIN

        DECLARE song_date DATE; 
        DECLARE album_date DATE;

        SET song_date = (SELECT date_of_release FROM songs WHERE song_id = NEW.song_id);
        SET album_date = (SELECT date_of_release FROM albums WHERE album_id = NEW.album_id);

    IF (song_date > album_date) 
    THEN UPDATE songs SET date_of_release = album_date

WHERE song_id = NEW.song_id; 

    END IF;

END //


##Q4
DELIMITER //
CREATE PROCEDURE AddTrack(IN A INT, IN S INT) 
    BEGIN
        DECLARE TN INT;
        SET TN = (SELECT MAX(track_no) FROM song_album WHERE album_id = A);

        IF (SELECT COUNT(*) FROM albums WHERE album_id = A) = 1
        AND (SELECT COUNT(*) FROM songs WHERE song_id = S) = 1
        THEN
            INSERT INTO song_album (song_id, album_id, track_no) VALUES (S, A, TN + 1);
        END IF;
    END;
    //


##Q5
DELIMITER //
CREATE FUNCTION GetTrackList(A INT(10))
RETURNS TEXT
DETERMINISTIC

BEGIN
    DECLARE B BLOB;

    SELECT GROUP_CONCAT(song_name ORDER BY track_no DESC SEPARATOR ',') INTO B 
    FROM song_album LEFT JOIN songs USING (song_id) 
    WHERE album_id = A;
    
    RETURN B;
END;
//

