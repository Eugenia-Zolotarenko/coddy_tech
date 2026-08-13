package iterapor.pattern;

// Simple Song class that wraps a song title
public class Song {
    // TODO: Add a private field to store the title
    private String title;

    // TODO: Create a constructor that takes the title (String)
    public Song(String title) {
        this.title = title;
    }

    // TODO: Implement getTitle() method
    public String getTitle() {
        return title;
    }

    // TODO: Implement toString() method that returns "Playing: [title]"
    @Override
    public String toString() {
        return "Playing: " + title;
    }
}
