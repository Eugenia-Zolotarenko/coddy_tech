package AgeVerificationSystem;

// AgeVerifier.java
// Contains methods that demonstrate checked vs unchecked exceptions

class AgeVerifier {

    // TODO: Implement verifyAge(int age)
    // - Throws NegativeAgeException (unchecked) if age < 0
    //   Message: "Age cannot be negative: [age]"
    // - Throws InvalidAgeException (checked) if age < 18
    //   Message: "Must be 18 or older: [age]"
    // - Otherwise prints: "Age [age] verified successfully"
    // IMPORTANT: Must declare "throws InvalidAgeException" since it's checked!
    public static void verifyAge(int age) throws InvalidAgeException{
        if(age < 0)
            throw new NegativeAgeException( "Age cannot be negative: " + age);
        if(age < 18)
            throw new InvalidAgeException("Must be 18 or older: " + age);
        System.out.println("Age " +age + " verified successfully");
    }


    // TODO: Implement verifyAgeUncheckedOnly(int age)
    // - Throws NegativeAgeException if age < 0
    //   Message: "Age cannot be negative: [age]"
    // - Throws IllegalArgumentException if age < 18
    //   Message: "Too young: [age]"
    // - Otherwise prints: "Age [age] verified (unchecked method)"
    // NOTE: No throws declaration needed - all exceptions are unchecked!
    public static void verifyAgeUncheckedOnly(int age){
        if(age < 0)
            throw new NegativeAgeException( "Age cannot be negative: " + age);
        if(age < 18)
            throw new IllegalArgumentException( "Too young: " + age);
        System.out.println("Age " +age + " verified (unchecked method)");
    }
}