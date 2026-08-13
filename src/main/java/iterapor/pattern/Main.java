package iterapor.pattern;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        String input = "Hello";
        input = "Yesterday,Imagine,Let It Be";
        input = "Bohemian Rhapsody,Stairway to Heaven,Hotel California";
        input = "Shape of You,Blinding Lights,Dance Monkey,Someone Like You,Rolling in the Deep,Uptown Funk,Despacito,Closer";
        //input = "A,B,C,D,E,F,G,H,I,J";

        // TODO: Create a Playlist with capacity for 10 songs
        Playlist playlist = new Playlist(10);

        // TODO: Parse the input (comma-separated) and add each song title to the playlist
        String[] songsList = input.split(",");
        for (String song: songsList){
            playlist.addSong(song);
        }

        // TODO: Obtain an iterator from the playlist using createIterator()
        Iterator<String> iteratorSongs = playlist.createIterator();

        // TODO: Use the iterator to traverse through all songs
        // For each song, wrap it in a Song object and print it
        while (iteratorSongs.hasNext()){

            System.out.println(new Song(iteratorSongs.next()));
        }

        // TODO: Print "Playlist complete!" after iterating through all songs
        System.out.println("Playlist complete!");
    }
}
