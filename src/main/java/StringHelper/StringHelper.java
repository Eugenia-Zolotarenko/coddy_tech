package StringHelper;

public class StringHelper {
    private String text;

    public StringHelper(String text) {
        this.text = text;
    }

    // TODO: Create a method toUpperCase() that returns this.text in uppercase
    // Hint: use this.text.toUpperCase()
    public String toUpperCase(){
        return this.text.toUpperCase();
    }

    // TODO: Create a method getLength() that returns the length of this.text as an int
    // Hint: use this.text.length()
    public int getLength(){
        return this.text.length();
    }

    // TODO: Create a method contains(String word) that returns true/false if this.text contains the word
    // Hint: use this.text.contains(word)
    public boolean contains(String word){
        return this.text.contains(word);
    }

    // TODO: Create a method repeat(int times) that returns this.text repeated 'times' times
    // Each repetition followed by a space
    // Hint: use a for loop and string concatenation
    public String repeat(int times){
        String repeat = "";
        for (int i=1; i<=times; i++) {
            repeat = this.text + " " + repeat ;
        }
        return repeat;
    }
}