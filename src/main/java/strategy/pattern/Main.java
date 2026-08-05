package strategy.pattern;


class Main {
    public static void main(String[] args) {

        String text = "hello world";
        String style = "title";


      text = "hello world";
      style = "upper";

      text = "hello world";
      style = "lower";

      text = "JAVA PROGRAMMING";
      style = "lower";

      text = "java programming";
      style = "upper";

      text = "jAvA pRoGrAmMiNg";
      style = "title";



        // TODO: Create a TextEditor instance
        TextEditor textEditor = new TextEditor();

        // TODO: Call publishText with the input text (before setting any formatter)
        textEditor.publishText(text);

        // TODO: Based on the style input ("upper", "lower", or "title"),
        // set the appropriate formatter and call publishText again
        switch (style){
            case "upper" -> textEditor.setFormatter(new UpperCaseFormatter());
            case "lower" -> textEditor.setFormatter(new LowerCaseFormatter());
            case "title" -> textEditor.setFormatter(new TitleCaseFormatter());
        }

        textEditor.publishText(text);

    }
}
