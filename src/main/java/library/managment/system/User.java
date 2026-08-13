package library.managment.system;

import java.util.ArrayList;

class User {
    // TODO: Declare private fields
    // - id (String)
    // - name (String)
    private String id,
                   name;

    //STEP2: TODO: Add a private ArrayList<Book> field called borrowedBooks
    private ArrayList<Book> borrowedBooks;

    // TODO: Create a constructor that accepts id and name

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        //STEP2: TODO: Initialize borrowedBooks as a new ArrayList<Book>()
        this.borrowedBooks = new ArrayList<Book>();
    }
    // TODO: Create getter methods
    // - getId()
    // - getName()

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    //STEP2: TODO: Add a borrowBook(Book book) method
       // Adds the book to borrowedBooks and sets the book's borrowedBy to this user's ID
    public void borrowBook(Book book){
        borrowedBooks.add(book);
        book.setBorrowedBy(this.id);
    }
    // STEP2: TODO: Add a returnBook(Book book) method
     // Removes the book from borrowedBooks and sets borrowedBy to null
    public void returnBook(Book book){
        borrowedBooks.remove(book);
        book.setBorrowedBy(null);
    }

    //STEP2: TODO: Add a getBorrowedCount() method
     // Returns the number of books currently borrowed
    public int getBorrowedCount(){
        return borrowedBooks.size();
    }

    // TODO: Override toString() method
    // Should return: "User[id]: name"
    @Override
    public String toString() {
        return "User[" + id + "]: " + name;
    }
}
