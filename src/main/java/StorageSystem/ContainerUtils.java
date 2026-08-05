package StorageSystem;

import java.util.List;

class ContainerUtils {

    // TODO: Implement printAll(Container<?> container)
    // Uses an unbounded wildcard to print all elements, one per line
    public static void printAll(Container<?> container){
        for (Object c : container.elements){
            System.out.println(c);
        }
    }

    // TODO: Implement countItems(Container<? extends Number> container)
    // Uses an upper bounded wildcard to calculate the sum of all numeric values
    // Returns the result as a double
    public static double countItems(Container<? extends Number> container) {
        double sum = 0;
        for(Number el: container.elements){
            sum += el.doubleValue();
        }
        return sum;
    }

    // TODO: Implement addDefaults(Container<? super Integer> container)
    // Uses a lower bounded wildcard to add integers 1, 2, and 3
    public static  void addDefaults(Container<? super Integer> container) {
        container.elements.add(1);
        container.elements.add(2);
        container.elements.add(3);
    }

    // TODO: Implement <T> T getLastOrDefault(Container<T> container, T defaultValue)
    // A generic method that returns the last element, or defaultValue if empty
    public static <T> T getLastOrDefault(Container<T> container, T defaultValue){
        return container.isEmpty() ? defaultValue : container.elements.getLast();
    }
}
