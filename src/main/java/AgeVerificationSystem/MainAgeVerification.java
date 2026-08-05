package AgeVerificationSystem;

public class MainAgeVerification {
    public static void main(String[] args) {

        int age = -5;

        // TODO: Test the checked exception method
        // Print: "=== Checked Exception Method ==="
        // Call AgeVerifier.verifyAge(age) in a try-catch
        // - Catch InvalidAgeException: print "Checked exception caught: [message]"
        // - Catch NegativeAgeException: print "Unchecked exception caught: [message]"
        System.out.println("=== Checked Exception Method ===");
        try {
            AgeVerifier.verifyAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        } catch (NegativeAgeException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }

        // TODO: Print a blank line, then "=== Unchecked Exception Method ==="
        // Call AgeVerifier.verifyAgeUncheckedOnly(age) in a try-catch
        // - Catch NegativeAgeException: print "Runtime exception caught: [message]"
        // - Catch IllegalArgumentException: print "Illegal argument caught: [message]"
        System.out.println();
        System.out.println("=== Unchecked Exception Method ===");
        try {
            AgeVerifier.verifyAgeUncheckedOnly(age);
        }
        catch (NegativeAgeException e){
            System.out.println("Runtime exception caught: " + e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println("Illegal argument caught: " + e.getMessage());
        }
    }
}
