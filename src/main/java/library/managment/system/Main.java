package library.managment.system;

import java.security.SecureRandom;
import java.util.Arrays;
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

      userId = "S001";
        userName = "Jack";

        //STEP3: Read book 1 information
        String isbn1 = "ISBN-001";
        String title1 = "Clean Code";
        String author1 = "Robert Martin";

        //STEP3: Read book 2 information
        String isbn2 = "ISBN-002";
        String title2 = "Design Patterns";
        String author2 = "Gang of Four";

        isbn1 = "MATH-1";
        title1 = "Calculus";
        author1 = "Newton";

        //STEP3: Read book 2 information
        isbn2 = "MATH-2";
        title2 = "Linear Algebra";
        author2 = "Gilbert Strang";

        //STEP3: Read operations string (comma-separated, format: borrow:userId:isbn or return:userId:isbn)
        String operationsStr = "borrow:U001:ISBN-001,borrow:U001:ISBN-002,return:U001:ISBN-001";
        operationsStr = "borrow:ID-123:INVALID-ISBN";
        operationsStr = "borrow:S001:MATH-1,borrow:WRONG:MATH-2,return:S001:MATH-1";


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
        //STEP3:
        System.out.println();

        // TODO: Print the user using toString()
     // STEP2:  System.out.println(user);

        //STEP3: TODO: Create Book objects for book1 and book2
        Book book1 = new Book(isbn1, title1, author1);
        Book book2 = new Book(isbn2, title2, author2);

        //STEP3: TODO: Create a User object
        //User user1 = new User(userId, userName);

        //STEP3: TODO: Create a Library, add both books, and register the user
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.registerUser(user);

        //STEP3: TODO: Split operationsStr by "," and process each operation
        //       For each operation, split by ":" to get action, userId, isbn
        //       Call library.borrowBook() or library.returnBook() accordingly
        String[] operations = operationsStr.split(",");

        for(String operation: operations){
            String[] currentOperation = operation.split(":");
            switch (currentOperation[0]){
                case "borrow" -> library.borrowBook(currentOperation[1], currentOperation[2]);
                case "return" -> library.returnBook(currentOperation[1], currentOperation[2]);
            }
        }

        //STEP3: TODO: Print summary for each book in format "[isbn]: [Available/Borrowed]"
        for (Book libraryBook: library.getBooks()){
            String available = (libraryBook.isAvailable()?"Available": "Borrowed");
            System.out.println(libraryBook.getIsbn()+ ": " + available);
        }

    }
}
