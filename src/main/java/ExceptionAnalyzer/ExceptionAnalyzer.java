package ExceptionAnalyzer;

class ExceptionAnalyzer {

    // TODO: Implement analyzeSpecific(String type)
    // Call ExceptionThrower.triggerRuntime(type) in a try block
    // Use separate catch blocks for NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException
    // Print: "Caught specific: [exception class simple name]"
    // Print: "Message: [exception message]"
    // Hint: Use e.getClass().getSimpleName() and e.getMessage()
    public static void analyzeSpecific(String type) {
        // TODO: Implement this method
        try {
            ExceptionThrower.triggerRuntime(type);
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println("Caught specific: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }

    // TODO: Implement analyzeWithParent()
    // Call ExceptionThrower.triggerArithmetic() in a try block
    // Catch using RuntimeException (the parent type)
    // Print: "Caught via parent: RuntimeException"
    // Print: "Actual type: [exception class simple name]"
    public static void analyzeWithParent() {
        // TODO: Implement this method
        try {
            ExceptionThrower.triggerArithmetic();
        } catch (RuntimeException e) {
            System.out.println("Caught via parent: RuntimeException");
            System.out.println("Actual type: " + e.getClass().getSimpleName());
        }
    }

    // TODO: Implement analyzeWithGrandparent()
    // Call ExceptionThrower.triggerGeneric() in a try block
    // Catch using Exception (higher in hierarchy)
    // Print: "Caught via grandparent: Exception"
    // Print: "Actual type: [exception class simple name]"
    public static void analyzeWithGrandparent() {
        // TODO: Implement this method
        try {
            ExceptionThrower.triggerGeneric();
        }
        catch (Exception e){
            System.out.println("Caught via grandparent: Exception");
            System.out.println("Actual type: " + e.getClass().getSimpleName());
        }
    }
}