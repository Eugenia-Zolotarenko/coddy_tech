package GenericBox;

public class MainGenericBox {
    public static void main(String[] args) {

        String word = "Hello";
        int number = 42;

        // TODO: Create an OldBox storing the word
        // Retrieve with cast to String and print: "OldBox (with cast): [value]"
        OldBox oldBox = new OldBox(word);
        System.out.println("OldBox (with cast): "  + (String) oldBox.getContent());

        // TODO: Create a GenericBox<String> storing the word
        // Retrieve without casting and print: "GenericBox (no cast): [value]"
        GenericBox<String> boxString = new GenericBox<String>(word);
        System.out.println("GenericBox (no cast): " + boxString.getContent());

        // TODO: Create a GenericBox<Integer> storing the number
        // Retrieve and print: "GenericBox Integer: [value]"
        GenericBox<Integer> boxInt = new GenericBox<>(number);
        System.out.println("GenericBox Integer: " + boxInt.getContent());

        // TODO: Print a blank line, then print:
        // "Type safety: Generics catch errors at compile time!"
        System.out.println();
        System.out.println("Type safety: Generics catch errors at compile time!");
    }
}
