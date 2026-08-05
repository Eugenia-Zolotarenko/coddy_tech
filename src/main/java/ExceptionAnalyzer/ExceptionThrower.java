package ExceptionAnalyzer;

class ExceptionThrower {

    // TODO: Implement triggerRuntime(String type)
    // If type is "null", throw NullPointerException with message "Null value encountered"
    // If type is "index", throw ArrayIndexOutOfBoundsException with message "Invalid index"
    // If type is "argument", throw IllegalArgumentException with message "Bad argument"
    public static void triggerRuntime(String type) {
        // TODO: Implement this method
        switch (type) {
            case "null" -> throw new NullPointerException("Null value encountered");
            case "index" -> throw new ArrayIndexOutOfBoundsException("Invalid index");
            case "argument" -> throw new IllegalArgumentException("Bad argument");
        }
    }

    // TODO: Implement triggerArithmetic()
    // Throw an ArithmeticException with message "Division error"
    public static void triggerArithmetic() {
        // TODO: Implement this method
        throw new ArithmeticException("Division error");
    }

    // TODO: Implement triggerGeneric()
    // Throw a RuntimeException with message "Generic runtime error"
    public static void triggerGeneric() {
        // TODO: Implement this method
        throw new RuntimeException("Generic runtime error");
    }
}