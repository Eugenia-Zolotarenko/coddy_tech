package ExceptionAnalyzer;

public class MainExceptionAnalyzer {
    public static void main(String[] args) {

        String type = "index";

        // TODO: Print "=== Specific Catch ===" and call ExceptionAnalyzer.analyzeSpecific(type)
        System.out.println("=== Specific Catch ===");
        ExceptionAnalyzer.analyzeSpecific(type);

        // TODO: Print a blank line, then "=== Parent Catch ===",
        //  then call ExceptionAnalyzer.analyzeWithParent()
        System.out.println();
        System.out.println("=== Parent Catch ===");
        ExceptionAnalyzer.analyzeWithParent();
        // TODO: Print a blank line, then "=== Grandparent Catch ===",
        //  then call ExceptionAnalyzer.analyzeWithGrandparent()
        System.out.println();
        System.out.println("=== Grandparent Catch ===");
        ExceptionAnalyzer.analyzeWithGrandparent();
    }
}
