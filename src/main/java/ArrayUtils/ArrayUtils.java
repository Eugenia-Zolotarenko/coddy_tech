package ArrayUtils;

public class ArrayUtils {
    // TODO: Implement getLast - a generic method that takes an array of type T
    // and returns the last element. Return null if array is empty.
    public static <T> T getLast(T[] array) {
        // Your code here
        if (array.length > 0) {
            return array[array.length-1];
        }
        return null;
    }

    // TODO: Implement swap - a generic method that takes an array of type T
    // and two integer indices, then swaps the elements at those positions.
    public static <T> void swap(T[] array, int i, int j) {
        // Your code here
        T element1 = array[i];
        T element2 = array[j];
        array[i] = element2;
        array[j] = element1;
    }

    // TODO: Implement printWithLabel - a generic method with two type parameters K and V
    // Takes a label of type K and a value of type V
    // Prints in format: [label]: [value]
    public static <K, V> void printWithLabel(K label, V value) {
        // Your code here
        System.out.println(label + ": " + value);
    }
}
