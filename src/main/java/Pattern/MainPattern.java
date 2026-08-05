package Pattern;

public class MainPattern {
    public static void main(String[] args) {

        String patternName = "Singleton";

        // TODO: Declare a variable of type Pattern (the interface)
        Pattern pattern = null;

        // TODO: Based on patternName, create the appropriate pattern object:
        // - "Singleton" and "Factory" are Creational patterns
        // - "Adapter" and "Decorator" are Structural patterns
        // - "Observer" and "Strategy" are Behavioral patterns
        switch (patternName){
            case "Singleton", "Factory" -> pattern = new CreationalPattern();
            case "Adapter", "Decorator" -> pattern = new StructuralPattern();
            case "Observer", "Strategy" -> pattern = new BehavioralPattern();
        }

        // TODO: Print the output in the following format:
        // Pattern: [input pattern name]
        // Category: [category from getCategory()]
        // Purpose: [purpose from getPurpose()]
        System.out.println("Pattern: " + patternName);
        System.out.println("Category: " + pattern.getCategory());
        System.out.println("Purpose: " + pattern.getPurpose());
    }
}
