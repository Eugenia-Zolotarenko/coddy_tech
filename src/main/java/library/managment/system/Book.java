package library.managment.system;

class Book {
    // TODO: Declare private fields
    // - isbn (String)
    // - title (String)
    // - author (String)
    // - isAvailable (boolean, should default to true)
    private String isbn,
                   title,
                   author;
    private boolean isAvailable;// = true;
    //STEP2: TODO: Add a private String field called borrowedBy
    private String borrowedBy;
    // TODO: Create a constructor that accepts isbn, title, and author
    // Remember to set isAvailable to true by default

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        //STEP2: TODO: Initialize borrowedBy to null
        this.borrowedBy = null;
    }

    // TODO: Create getter methods for all fields
    // - getIsbn()
    // - getTitle()
    // - getAuthor()
    // - isAvailable() or getIsAvailable()

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    //STEP2: TODO: Add a getter for borrowedBy
    public String getBorrowedBy() {
        return borrowedBy;
    }
    //STEP2: TODO: Add a setter for borrowedBy that also updates isAvailable
        // When borrowedBy is set to a non-null value, isAvailable becomes false
        // When borrowedBy is set to null, isAvailable becomes true
    public void setBorrowedBy(String userID) {
        this.borrowedBy = userID;
        if(borrowedBy == null){
            isAvailable = true;
         } else isAvailable = false;
    }

    // TODO: Create a setter for isAvailable
      // - setAvailable(boolean available)
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // TODO: Create getDetails() method
    // Should return: "[isbn] title by author"
    public String getDetails(){
        return "["+isbn+"] " + title + " by " + author;
    }
}

