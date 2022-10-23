import java.util.*;

public class Playlist {

    String myPlaylist; //declared my string for playlist name
    ArrayList<Track> myTracks; //the array list which will be used for the songs

    public Playlist() {
        this.myPlaylist = "Olan's Masterplan Play"; //naming playlist
        this.myTracks = new ArrayList<>();
    }

    public Playlist (String playlistName) {
        this.myPlaylist = playlistName;
        this.myTracks = new ArrayList<>();

    }

    public String toString() {
        ArrayList<String> result = new ArrayList<>();

        for (Track track: this.myTracks){
            result.add(track.toString());

        }
        return result.toString();
    }

    public void setName (String name) {
        this.myPlaylist = name; //allows us to change the playlist name
    }

    public String getName() {
        return ""; //a return function which will return the specified name
    }

    public void add(String title, String artist) { 
        this.myTracks.add(new Track(title, artist)); //enables our songs to have the track title and artist
    }

    public void add(String title, String artist, int year, int duration) {
        this.myTracks.add(new Track(title, artist,year, duration)); //enables our songs to have the track title, artist and length
    }

    public void add(Track newTrack) {
        this.myTracks.add(newTrack); //enables us to add a new track 
    }

    public boolean remove(String title){
        //If there's a track with the same title,
        //the track will be removed and its result will return true.
        //If not it will return false and will be unchanged
        boolean result = false; 

        for(int i=this.myTracks.size()-1; i>= 0; i--){ // int i will be the last song in the playlist and will get the value 
            // for i. If the title equals the title specifeid it will remove i. it will then go to the next last song in playlist
            // and test each song for the desired title we search for.
            Track track = this.myTracks.get(i);

            if(track.getTitle().equalsIgnoreCase(title)){
                myTracks.remove(i);
                result = true;
            }
        }

        return result;
    }

    public void showList(){
        if(this.myTracks.size() == 0){
            System.out.println("The list is empty");
            // if there is no songs in a certain playlist. It will return this statement above

            return;
        }

        for(Track newTrack: this.myTracks){
            System.out.println(newTrack); //every new track implemented seperate to playlist will be pritned
        }
    }

    public void playAll(boolean random){
        int size = this.myTracks.size();

        int[] playOrder = new int[size]; 

        if(!random){
            for(int i=0;i < size;i++){ //when i is 0, if i is less then the size of the playlist, it will be added into the play
                //order and i will be given + 1 
                playOrder[i] = i;
            }
        } else{ //otherwise, 

            // make new array that all values are 0
            int[] temp = new int[size];

            int temp2 = 0;
            while (temp2 < size){
                int position = (int)(Math.random() * size); // position given random number in the playlist

                if(temp[position] == 0){
                    // save the position in playorder array
                    playOrder[temp2] = position;

                    // mark the position as used
                    temp[position] = 1;

                    // move onto the next spot in the play order
                    temp2+= 1;
                }
            }
        }

        playTracks(playOrder);
    }

    public void playOnly(String artist){
        int size = this.myTracks.size();
        int[] playOrder = new int[size]; //playorder = size of playlist

        int store = 0; //int which will be used to store our track we look for
        for(int i=0;i < size;i++){
            Track track = this.myTracks.get(i); //gets the track desired

            if(track.getArtist().toLowerCase().contains(artist.toLowerCase())){   //if it contains the artist name do
                playOrder[store] = i; //play order will equal the track we got
                store += 1;
            }
        }

        if(store < size){
            // resize (if needed)
            playOrder = Arrays.copyOf(playOrder, store);
        }

        playTracks(playOrder);
    }

    public void playOnly(int year){
        int size = this.myTracks.size(); //same aa above except we do it for the year
        int[] playOrder = new int[size];

        int store = 0;
        for(int i=0;i < size;i++){
            Track track = this.myTracks.get(i);

            if(track.getYear() == year){
                playOrder[store] = i;
                store += 1;
            }
        }

        if(store < size){
            // resize (if needed) 
            playOrder = Arrays.copyOf(playOrder, store);
        }

        playTracks(playOrder);
    }

    private void playTracks (int[] playOrder){
        for(int playTracks: playOrder){  
            System.out.println(this.myTracks.get(playTracks));
        }
    }
}
