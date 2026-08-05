import java.util.HashSet;
import java.util.Objects;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();
        set1=null;
        System.out.println(set1);
        String input = "Banana";
        //set.add(input);
        System.out.println(set);
        System.out.println( set.add(input) ? "Added successfully": "Element already exists" );
        System.out.println(set);
        System.out.println( set.add(input) ? "Added successfully": "Element already exists" );

        System.out.println(processValue(3.4));
        String s;
        //Object[] ar = {50, "large", 150, 30};

        System.out.println(processArray(new Object[]{50, "large", 150, 30}, "find"));




    }

    public static String processArray(Object[] data, String type) {
        // Write your code here
        if(data == null || data.length ==0)  return "Invalid input";
        if(type.isBlank())  return "Invalid type";
        double sum =0;
        int index = -1;

        if (type.equals("sum")){
            for (Object o : data) {
                if (o instanceof Integer i)  {
                    sum += i;
                } else if (o instanceof Double d){
                    sum +=d;
                }
            }
            return "Sum: " + sum;
        } else if (type.equals("find")) {
            search: for (int i=0; i<data.length; i++){
                if (data[i] instanceof Integer d ) {
                    if (d > 100) {
                       // index = i;
                        return String.valueOf(i);
                       // break search;
                    }
                }
            } return "Not found";
        } else return "Invalid type";
    }

    public static String processValue(Object value) {
        // TODO: Use pattern matching with instanceof to process the value
        // If it's an Integer: return "Number: " + (value * 2)
        // If it's a String: return "Text: " +
        // value.toUpperCase()
        // If it's a Boolean: return "Boolean: " + (!value)
        // For any other type: return "Unknown"

        if (value instanceof Integer i){
            return  "Number: " + 2*i;
        } else if ( value instanceof String s) {
            return "Text: " + s.toLowerCase();
        } else if (value instanceof Boolean b) {
            return "Boolean: " + !b;
        } else
            return  "Unknown";


//        return  switch(value){
//            case value instanceof Integer i -> "Number: " + 2*i;
//            case value instanceof String s-> "Text: " + s.toLowerCase();
//            case value instanceof Boolean b-> "Boolean: " + !b;
//                default -> "Unknown";
//        };

    }
}
