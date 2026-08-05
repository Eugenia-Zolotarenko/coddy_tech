package StorageSystem;

public class MainContainer {
    public static void main(String[] args) {

        // Read inputs
        String word = "hello";
        int intValue = 42;
        double doubleValue = 3.14;

        // TODO: Create a Container<String> and add the word twice
        // Print "String container:" then use ContainerUtils.printAll()
        Container<String> stringContainer = new Container<>();
        stringContainer.add(word);
        stringContainer.add(word);
        System.out.println("String container:");
        ContainerUtils.printAll(stringContainer);

        // TODO: Create a Container<Double> and add the double value
        // Print a blank line, then "Number sum: [sum]" using ContainerUtils.countItems()
        Container<Double> doubleContainer = new Container<>();
        doubleContainer.add(doubleValue);
        System.out.println();
        System.out.println("Number sum: " + ContainerUtils.countItems(doubleContainer));

        // TODO: Create a Container<Number> and call ContainerUtils.addDefaults() on it
        // Print a blank line, then "After adding defaults:" and use ContainerUtils.printAll()
        Container<Number> numberContainer = new Container<>();
        ContainerUtils.addDefaults(numberContainer);
        System.out.println();

        System.out.println("After adding defaults:");
        ContainerUtils.printAll(numberContainer);

        // TODO: Create an empty Container<Integer>
        // Use ContainerUtils.getLastOrDefault() with intValue as default
        // Print a blank line, then "Last or default: [result]"
        Container<Integer> integerContainer = new Container<>();
        System.out.println();

        System.out.println("Last or default: " +
                ContainerUtils.getLastOrDefault(integerContainer, intValue));
    }
}
