package UserRegistrationsSystem;

// UserValidator.java
// A validation session that implements AutoCloseable

// TODO: Create a class called UserValidator that implements AutoCloseable

class UserValidator implements AutoCloseable {

    // TODO: Constructor should print "Validator session started"
    public UserValidator() {
        // TODO: Implement
        System.out.println("Validator session started");
    }

    // TODO: Implement validateUsername method
    // - Throws InvalidUsernameException if username is null, empty, or less than 3 characters
    //   with message "Username must be at least 3 characters"
    // - Otherwise prints "Username '[username]' is valid"
    public void validateUsername(String username) throws InvalidUsernameException {
        // TODO: Implement validation logic
        if(username == null | username.isBlank() | username.length()<3)
            throw new InvalidUsernameException("Username must be at least 3 characters");
        System.out.println("Username '" + username + "' is valid");
    }

    // TODO: Implement validateAge method
    // - Throws InvalidAgeException if age is negative with message "Age cannot be negative: [age]"
    // - Throws ValidationException if age is less than 13 with message "Must be at least 13 years old"
    // - Otherwise prints "Age [age] is valid"
    public void validateAge(int age) throws ValidationException {
        // TODO: Implement validation logic
        if (age <0 )
            throw new InvalidAgeException("Age cannot be negative: " + age);
        if(age<13)
            throw new ValidationException("Must be at least 13 years old");
        System.out.println("Age " + age + " is valid");
    }

    // TODO: Implement close method to print "Validator session closed"
    @Override
    public void close() {
        // TODO: Implement
        System.out.println("Validator session closed");
    }
}