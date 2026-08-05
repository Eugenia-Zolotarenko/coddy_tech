package UserRegistrationsSystem;

public class MainUserRegistrationsSystem {
    public static void main(String[] args) {
        // Read inputs
        String username = "validuser";
        int age = 100;
        // TODO: Use try-with-resources to create a UserValidator
        // Inside the try block:
        //   1. Validate the username
        //   2. Validate the age
        //   3. If both pass, print "User registration successful!"
        try(UserValidator userValidator = new UserValidator()){
            userValidator.validateUsername(username);
            userValidator.validateAge(age);
            System.out.println("User registration successful!");

        // TODO: Catch InvalidUsernameException and print "Username error: [message]"
        } catch (InvalidUsernameException e) {
            System.out.println("Username error: " + e.getMessage());
        }
        // TODO: Catch InvalidAgeException and print "Age error: [message]"
        catch (InvalidAgeException  e) {
          System.out.println("Age error: " + e.getMessage());
        }
        // TODO: Catch ValidationException (parent) and print "Validation error: [message]"
        catch (ValidationException  e) {
            System.out.println("Validation error: " + e.getMessage());
        }
        // Note: The validator should automatically close regardless of success or failure!
    }
}
