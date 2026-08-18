package library.managment.system;
// TODO: Create a base custom exception class called LibraryException
// - It should extend Exception
// - Include a constructor that accepts a message and passes it to the parent class

public class LibraryException extends  Exception{
    public LibraryException(String message) {
        super(message);
    }
}
