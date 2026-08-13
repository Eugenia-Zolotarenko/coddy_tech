package iterapor.pattern;

// Aggregate class that holds songs and provides an iterator
public class Playlist {
    // TODO: Add a String array to store songs
    // TODO: Add a variable to track the number of songs added
    private String[] songs;
    public int count = 0;

    // TODO: Create a constructor that takes capacity and initializes the array

    public Playlist(int capacity) {
        this.songs = new String[capacity];
    }

    // TODO: Implement addSong(String song) method to add songs to the playlist
    public void addSong(String song){
        songs[count++] = song;
    }

    // TODO: Implement createIterator() method that returns an Iterator<String>
    Iterator<String> createIterator(){
        return new songIterator();
    }

    // TODO: Create a private inner class PlaylistIterator that implements Iterator<String>
    // The inner class should:
    // - Maintain its own index position
    // - Implement hasNext() to check if more songs exist
    // - Implement next() to return the next song
    private class songIterator implements Iterator{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public String next() {
            return songs[index++];
        }
    }

}
