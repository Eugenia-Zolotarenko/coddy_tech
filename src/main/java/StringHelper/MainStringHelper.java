package StringHelper;

public class MainStringHelper {
    public static void main(String[] args) {
        StringHelper helper = new StringHelper("Hello World");

        //System.out.println("Original: " + input);
        System.out.println("Uppercase: " + helper.toUpperCase());
        System.out.println("Length: " + helper.getLength());
        System.out.println("Contains 'World': " + helper.contains("World"));
        System.out.println("Repeated: " + helper.repeat(3));
    }
}
