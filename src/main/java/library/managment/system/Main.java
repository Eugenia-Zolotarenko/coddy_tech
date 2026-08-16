package library.managment.system;
import java.util.Scanner;
import java.util.ArrayList;
//STEP6:
class Main {
    public static void main(String[] args) {

        // Read the comma-separated commands
        String input = "ADD_BOOK:ISBN-001:Clean Code:Robert Martin,REGISTER_USER:U001:Alice,BORROW:U001:ISBN-001,BORROW:U001:ISBN-001,BORROW:U002:ISBN-001";
        String[] commands = input.split(",");

        // Create Library and AdminService
        Library library = new Library();
        AdminService adminService = new AdminService(library);

        // Process each command
        for (String command : commands) {
            String[] parts = command.split(":");
            String operation = parts[0];

            if (operation.equals("ADD_BOOK")) {
                String isbn = parts[1];
                String title = parts[2];
                String author = parts[3];
                if (adminService.addBook(isbn, title, author)) {
                    System.out.println("Added: " + title);
                }
            } else if (operation.equals("REMOVE_BOOK")) {
                String isbn = parts[1];
                if (adminService.removeBook(isbn)) {
                    System.out.println("Removed: " + isbn);
                } else {
                    System.out.println("Cannot remove: " + isbn);
                }
            } else if (operation.equals("REGISTER_USER")) {
                String id = parts[1];
                String name = parts[2];
                if (adminService.registerUser(id, name)) {
                    System.out.println("Registered: " + name);
                }
            } else if (operation.equals("BORROW")) {
                String userId = parts[1];
                String isbn = parts[2];
                // TODO: Use a try-catch block to call library.borrowBook(userId, isbn)
                // On success, print the returned confirmation message
                // On LibraryException, print "Error: " + e.getMessage()
                try{
                    //library.borrowBook(userId, isbn);
                    System.out.println(library.borrowBook(userId, isbn));
                } catch (LibraryExceptions e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        // TODO: Print "Operations completed"
        System.out.println("Operations completed");
    }
}

////
////import java.security.SecureRandom;
////import java.util.ArrayList;
////import java.util.Arrays;
////import java.util.Scanner;
////
//
//import java.util.Scanner;
//import java.util.ArrayList;
////STEP5
//class Main {
//    public static void main(String[] args) {
//
//        // Read the comma-separated commands
//        String input = "ADD_BOOK:ISBN-001:Java Basics:John Doe";
//        input = "ADD_BOOK:ISBN-001:Data Structures:Alice Brown,ADD_BOOK:ISBN-002:Algorithms:Bob White,REMOVE_BOOK:ISBN-003";
//
//        String[] commands = input.split(",");
//
//        // Create Library and AdminService
//        Library library = new Library();
//        AdminService adminService = new AdminService(library);
//
//        // Process each command
//        for (String command : commands) {
//            String[] parts = command.split(":");
//            String operation = parts[0];
//
//            if (operation.equals("ADD_BOOK")) {
//                String isbn = parts[1];
//                String title = parts[2];
//                String author = parts[3];
//                if (adminService.addBook(isbn, title, author)) {
//                    System.out.println("Added: " + title);
//                }
//            } else if (operation.equals("REMOVE_BOOK")) {
//                String isbn = parts[1];
//                if (adminService.removeBook(isbn)) {
//                    System.out.println("Removed: " + isbn);
//                } else {
//                    System.out.println("Cannot remove: " + isbn);
//                }
//            } else if (operation.equals("REGISTER_USER")) {
//                String id = parts[1];
//                String name = parts[2];
//                if (adminService.registerUser(id, name)) {
//                    System.out.println("Registered: " + name);
//                }
//            } else if (operation.equals("BORROW")) {
//                String userId = parts[1];
//                String isbn = parts[2];
//                library.borrowBook(userId, isbn);
//            }
//        }
//
//        // Print library status
//        System.out.println("Library status:");
//        ArrayList<Book> allBooks = library.getAllBooks();
//        for (Book book : allBooks) {
//            String status = book.isAvailable() ? "Available" : "Borrowed";
//            System.out.println(book.getDetails() + " - " + status);
//        }
//    }
//}
//
////class Main {
////    public static void main(String[] args) {
////
////        // Read book information
////        String isbn = "978-0-13-468599-1";
////        String title = "Effective Java";
////        String author = "Joshua Bloch";
////
////        // Read user information
////        String userId = "U001";
////        String userName = "Alice";
////
//////        userId = "S001";
//////        userName = "Jack";
////
////        //STEP3: Read book 1 information
////        String isbn1 = "ISBN-001";
////        String title1 = "Clean Code";
////        String author1 = "Robert Martin";
////
////        //STEP3: Read book 2 information
////        String isbn2 = "ISBN-002";
////        String title2 = "The Clean Coder";
////        String author2 = "Robert Martin";
////
//////        isbn1 = "MATH-1";
//////        title1 = "Calculus";
//////        author1 = "Newton";
////
////        //STEP3: Read book 2 information
//////        isbn2 = "MATH-2";
//////        title2 = "Linear Algebra";
//////        author2 = "Gilbert Strang";
////
////        //STEP4: Read book 3 information
////        String isbn3 = "ISBN-003";
////        String title3 = "Design Patterns";
////        String author3 = "Gang of Four";
////
////
////        //STEP3: Read operations string (comma-separated, format: borrow:userId:isbn or return:userId:isbn)
//////        String operationsStr = "borrow:U001:ISBN-001,borrow:U001:ISBN-002,return:U001:ISBN-001";
//////        operationsStr = "borrow:ID-123:INVALID-ISBN";
//////        operationsStr = "borrow:S001:MATH-1,borrow:WRONG:MATH-2,return:S001:MATH-1";
////
////        //STEP4: Read borrow operation
////        String borrowOp = "U001:ISBN-001";
////
////        //STEP4: Read search keywords
////        String titleKeyword = "clean";
////        String authorKeyword = "martin";
////
////
////        // TODO: Create a Book object with isbn, title, and author
////        Book book = new Book(isbn, title, author);
////        // TODO: Create a User object with userId and userName
////        User user = new User(userId, userName);
////        // TODO: Print the book's details using getDetails()
////        System.out.println(book.getDetails());
////        // TODO: Print whether the book is available (format: "Available: true" or "Available: false")
////        System.out.println("Available: " + book.isAvailable());
////
////        //STEP2: Have the user borrow the book
////        user.borrowBook(book);
////        //STEP2: Print the book's availability again
////        System.out.println("Available: " + book.isAvailable());
////        //STEP2: Print who borrowed it
////        System.out.println("Borrowed by: " + book.getBorrowedBy());
////        //STEP2: Print how many books the user has
////        System.out.println(user.getName() + " has " + user.getBorrowedCount() + " book(s)");
////        //STEP2: Have the user return the book
////        user.returnBook(book);
////        //STEP2: Print the availability one more time
////        System.out.println("Available: " + book.isAvailable());
////        //STEP3:
////        System.out.println();
////
////        // TODO: Print the user using toString()
////        // STEP2:  System.out.println(user);
////
////        //STEP3: TODO: Create Book objects for book1 and book2
////        Book book1 = new Book(isbn1, title1, author1);
////        Book book2 = new Book(isbn2, title2, author2);
////        //STEP4:
////        Book book3 = new Book(isbn3, title3, author3);
////
////        //STEP3: TODO: Create a User object
////        //User user1 = new User(userId, userName);
////
////        //STEP3: TODO: Create a Library, add both books, and register the user
////        Library library = new Library();
////        library.addBook(book1);
////        library.addBook(book2);
////        //STEP4:
////        library.addBook(book3);
////        library.registerUser(user);
////
////        //STEP3: TODO: Split operationsStr by "," and process each operation
////        //       For each operation, split by ":" to get action, userId, isbn
////        //       Call library.borrowBook() or library.returnBook() accordingly
//////        String[] operations = operationsStr.split(",");
//////
//////        for (String operation : operations) {
//////            String[] currentOperation = operation.split(":");
//////            switch (currentOperation[0]) {
//////                case "borrow" -> library.borrowBook(currentOperation[1], currentOperation[2]);
//////                case "return" -> library.returnBook(currentOperation[1], currentOperation[2]);
//////            }
//////        }
////
////        //STEP3: TODO: Print summary for each book in format "[isbn]: [Available/Borrowed]"
//////        for (Book libraryBook : library.getBooks()) {
//////            String available = (libraryBook.isAvailable() ? "Available" : "Borrowed");
//////            System.out.println(libraryBook.getIsbn() + ": " + available);
//////        }
////        System.out.println();
////        System.out.println("-----------------------------STEP-4-----------------------------------");
////
////        //STEP4: Process borrow operation
////        String[] parts = borrowOp.split(":");
////        String opUserId = parts[0];
////        String opIsbn = parts[1];
////        library.borrowBook(opUserId, opIsbn);
////
////        //STEP4: TODO: Title search
////        // Print "Title search '[titleKeyword]':"
////        // Use library.searchByTitle(titleKeyword)
////        // Print each book's getDetails(), or "No books found" if empty
////        System.out.println("Title search '" + titleKeyword + "':");
////        ArrayList<Book> foundedByTitleBooks = library.searchByTitle(titleKeyword);
////        if(foundedByTitleBooks.size()==0){
////            System.out.println("No books found");
////        } else {
////            for (Book foundedBook : foundedByTitleBooks) {
////                System.out.println(foundedBook.getDetails());
////            }
////        }
////        //STEP4: TODO: Author search
////        // Print "Author search '[authorKeyword]':"
////        // Use library.searchByAuthor(authorKeyword)
////        // Print each book's getDetails(), or "No books found" if empty
////        System.out.println("Author search '" + authorKeyword + "':");
////        ArrayList<Book> foundedByAuthorBooks = library.searchByAuthor(authorKeyword);
////        if(foundedByAuthorBooks.size()==0){
////            System.out.println("No books found");
////        } else {
////            for (Book foundedBook : foundedByAuthorBooks) {
////                System.out.println(foundedBook.getDetails());
////            }
////        }
////
////        //STEP4: TODO: Available books
////        // Print "Available books:"
////        // Use library.getAvailableBooks()
////        // Print each book's getDetails()
////        System.out.println("Available books:");
////        for (Book availableBook: library.getAvailableBooks()){
////            System.out.println(availableBook.getDetails());
////        }
////    }
////}