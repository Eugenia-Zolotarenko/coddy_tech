package ArrayUtils;

public class MainUtils {
    public static void main(String[] args) {


        // Read inputs
        String firstWord = "hello";
        String secondWord = "world";
        int firstNumber = 10;
        int secondNumber = 20;

        // TODO: Create a String[] array containing both words
        String [] stringArray = {firstWord, secondWord};

        // TODO: Use ArrayUtils.getLast to get the last element
        // Print: "Last word: [result]"
        System.out.println("Last word: " + ArrayUtils.getLast(stringArray));

        // TODO: Create an Integer[] array containing both numbers
        Integer[] intArray = {firstNumber, secondNumber};

        // TODO: Call ArrayUtils.swap to swap elements at indices 0 and 1
        // Print: "After swap: [first], [second]"
        ArrayUtils.swap(intArray, 0,1);
        System.out.println("After swap: " + intArray[0] + ", " + intArray[1]);

        // TODO: Call ArrayUtils.printWithLabel with firstWord as label and firstNumber as value
        ArrayUtils.printWithLabel(firstWord, firstNumber);

        // TODO: Call ArrayUtils.printWithLabel with firstNumber as label and secondWord as value
        ArrayUtils.printWithLabel(firstNumber, secondWord);
    }
}
