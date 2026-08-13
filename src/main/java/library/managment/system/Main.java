package library.managment.system;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Read book information
        String isbn = "978-0-13-468599-1";
        String title = "Effective Java";
        String author = "Joshua Bloch";

        // Read user information
        String userId = "U001";
        String userName = "Alice Smith";

        // TODO: Create a Book object with isbn, title, and author
        Book book = new Book(isbn, title, author);
        // TODO: Create a User object with userId and userName
        User user = new User(userId, userName);
        // TODO: Print the book's details using getDetails()
        System.out.println(book.getDetails());
        // TODO: Print whether the book is available (format: "Available: true" or "Available: false")
        System.out.println("Available: " + book.isAvailable());
        // TODO: Print the user using toString()
        System.out.println(user);
    }
}
