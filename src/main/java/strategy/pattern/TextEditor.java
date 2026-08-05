package strategy.pattern;

// TODO: Create the TextEditor context class

class TextEditor {
    // TODO: Add a private field to hold the current TextFormatter strategy
    private TextFormatter currentTextFormatter;

    // TODO: Implement setFormatter(TextFormatter formatter) method
    // This method changes the active formatting strategy
    public void setFormatter(TextFormatter formatter){
        this.currentTextFormatter = formatter;
    }

    // TODO: Implement publishText(String text) method
    // - If a formatter is set, apply it to the text
    // - Print "Published: [formatted text]" or "Published: [original text]" if no formatter
    public void publishText(String text){
        if(this.currentTextFormatter!=null){
            System.out.println("Published: " + currentTextFormatter.format(text));
        } else
            System.out.println("Published: " + text);
    }
}