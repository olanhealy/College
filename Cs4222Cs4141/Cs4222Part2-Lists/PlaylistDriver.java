import java.util.*; 
public class PlaylistDriver {
    public static void main(String[] args) {

        System.out.println("Olan's masterplan");
        System.out.println("===============================================");

        Playlist myMusic = new Playlist();
        myMusic = new Playlist("EPIC PLAYLIST");
        System.out.println(myMusic.getName());

        
        myMusic.add("Brandy(You're a fine girl)", "Looking Glass", 1972, (3 * 60) + 07); // 3:07
        myMusic.add("Hooked on a Feeling", "Blue Swede", 1974, (2 * 60) + 48);
        myMusic.add("Moonage Daydream", "David Bowie", 1972, (4 * 60) + 35);
        myMusic.add("I'm Not in Love" , "10CC", 1975, (6 * 60) + 01);
        myMusic.add("Escape (the Pina colada Song)", "Rupert Holmes", 1979, (3 * 60) + 48 );
        myMusic.add("Ain't no Mountain High Enough" , "Marvin Gaye & Tammi Terrell", 1967, (2 * 60) + 25);
        myMusic.add("Come a little bit closer" , "Jay & The Americans", 1964, (2 * 60) + 46);
        myMusic.add("My Sweet Lord" , "George Harrison", 1970, (4 * 60) + 40);
        myMusic.add("Lake Shore Drive" , "Aliotta Haynes", 1971, (4 * 60) + 54);
        //Now a bit of wolfe tones. Never go wrong
        myMusic.add("Celtic Symphony" , "Wolfe Tones", 1989, (4 * 60) + 40);
        myMusic.add("Grace" , "Wolfe Tones" , 2004 , (4 * 60) + 31);
        myMusic.add("Go on Home British Soldiers" , "Wolfe Tones" , 2004, (2 * 60) + 54);
        myMusic.add("Skibberean" , "Wolfe Tones" , 1970, (2 * 60) + 53);
        myMusic.add("Streets of New York" , "Wolfe Tones" , 1981, (4 * 60) + 47);
        myMusic.add("On the One Road" , "Wolfe Tones" , 1972, (3 * 60) + 52 );

        // now print out the contents (uses toString automatically)
        System.out.println(myMusic);
        System.out.println();

        // lets start playing stuff
        System.out.println("===============");
        System.out.println("Play all (unshuffled)");
        System.out.println("===============");
        myMusic.playAll(false);
        System.out.println();

        System.out.println("===============");
        System.out.println("Play all (shuffled)");
        System.out.println("==============="); 
        myMusic.playAll(true);
        System.out.println();

        // complete match
        System.out.println("===============");
        System.out.println("Only Wolfe Tones");
        System.out.println("===============");
        myMusic.playOnly("Wolfe Tones");
        System.out.println();

        // partial
        System.out.println("===============");
        System.out.println("Brandy, you're a fine girl (still should work as weve some of artits name)");
        System.out.println("===============");
        myMusic.playOnly("Glass");
        System.out.println();

        System.out.println("===============");
        System.out.println("Love a bitta Lake Shore drive (done by year)");
        System.out.println("===============");
        myMusic.playOnly(1971);
        System.out.println();

        // no match
        System.out.println("===============");
        System.out.println("No Match's");
        System.out.println("===============");
        myMusic.playOnly("David Moyes");
        System.out.println("David Moyes manages the greatest football team in Europe. He dosn't make music but anyways WEST HAM ARE MASSIVE");
        System.out.println();

        // should have 2 match's
        System.out.println("===============");
        System.out.println("2 Match's with year");
        System.out.println("===============");
        myMusic.playOnly(1970);
        System.out.println();


        // track methods
        // create a track
        Track track = new Track("Dreamz", "Fleetwood Mac");


        // now with year and time
        track = new Track("Dreamz", "Fleetwood Mac", 2004, 258);

        // lets see it in proper detail
        System.out.println(track);

        // dreamz should be dreams so use get methods to fix
        if(track.getTitle().equals("Dreamz")){
            track.setTitle("Dreams");
        }

        // just to be sure print out the details
        System.out.println(track);

        // finally add it to the playlist
        myMusic.add(track);


    }
}
