import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String  text = "Let's build a text formatting system using the Strategy Pattern!";
        String[] words = text.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i< words.length; i++ ){
            result[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        System.out.println();
        System.out.println(String.join(" ", result));
    }
}
