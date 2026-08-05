import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainStringBuffer {
    public static void main(String[] args) {
        System.out.println(findWords("The cat and the cat and another cat", "cat"));

        System.out.println(tokenizeText("Coddy!","!"));

        System.out.println(formatData("Apple", 1.99, 1, "basic"));
        System.out.println(formatData("Banana", 0.99, 5, "detailed"));
        System.out.println(formatData("Orange", 0.75, 3, "total"));
        System.out.println(formatData("Orange", 0.75, 3, "invalid"));
        System.out.println(formatData(null, 0.75, 3, "basic"));
        System.out.println(formatData("Computer", 999.99, 2, "total"));
    }

    public static String findWords(String text, String word) {
        // Write your code here
        StringBuilder sb = new StringBuilder("");
        if(text==null || word==null)
            return "Invalid input";

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        if(!text.contains(word)) return "Not found";
        while (matcher.find()){
            sb.append(matcher.start()).append(" ");
        }
        return sb.toString().strip();

    }

    public static String tokenizeText(String text, String delimiter) {
        // Write your code here
        if (text==null) return "Invalid text";
        if (delimiter==null) delimiter = " ";
        StringTokenizer st = new StringTokenizer(text, delimiter);
        StringBuilder sb = new StringBuilder("Token count: ");

        int count = st.countTokens();
        sb.append(count).append("\n");

        while (st.hasMoreTokens()) {
            sb.append("Token: ").append(st.nextToken()).append("\n");
        }
        return sb.toString();

    }

    public static String formatData(String name, double price, int quantity, String format) {
        // Write your code here
        if(name==null || name.isBlank()
                || format ==null || format.isBlank() ){
            return "Invalid input";
        }
        String result="";

        switch(format){
            case "basic" ->
                    result = String.format("ITEM: %s, PRICE: $%.2f", name, price);

            case "detailed" ->
                    result = String.format("PRODUCT: %s\nPRICE: $%.2f\nQUANTITY: %d",
                            name, price, quantity);

            case "total" ->{
            double total = price*quantity;
            result = String.format("TOTAL FOR %dx %s: $%.2f",
                    quantity,name, total);
            }
            default -> result = "Invalid input";
        }return result;

    }






}
