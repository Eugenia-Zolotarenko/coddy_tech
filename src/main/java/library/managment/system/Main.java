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
        String userName = "Alice";

        // TODO: Create a Book object with isbn, title, and author
        Book book = new Book(isbn, title, author);
        // TODO: Create a User object with userId and userName
        User user = new User(userId, userName);
        // TODO: Print the book's details using getDetails()
        System.out.println(book.getDetails());
        // TODO: Print whether the book is available (format: "Available: true" or "Available: false")
        System.out.println("Available: " + book.isAvailable());

        //STEP2: Have the user borrow the book
        user.borrowBook(book);
        //STEP2: Print the book's availability again
        System.out.println("Available: " + book.isAvailable());
        //STEP2: Print who borrowed it
        System.out.println("Borrowed by: " + book.getBorrowedBy());
        //STEP2: Print how many books the user has
        System.out.println(user.getName() + " has " + user.getBorrowedCount() + " book(s)");
        //STEP2: Have the user return the book
        user.returnBook(book);
        //STEP2: Print the availability one more time
        System.out.println("Available: " + book.isAvailable());

        // TODO: Print the user using toString()
     // STEP2:  System.out.println(user);

    }
}
