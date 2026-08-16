package library.managment.system;

public class BookNotAvailableException extends LibraryExceptions{
    public BookNotAvailableException(String isbn) {
        super("Book not available: " + isbn);
    }
}

