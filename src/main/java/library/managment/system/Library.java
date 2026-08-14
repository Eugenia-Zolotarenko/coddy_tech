package library.managment.system;

import java.util.ArrayList;

class Library {
    // TODO: Declare two private ArrayLists — one for Book objects, one for User objects
    private ArrayList<Book> books;
    private ArrayList<User> users;

    // TODO: Constructor — initialize both ArrayLists
    public Library() {
        this.books = new ArrayList<Book>();
        this.users = new ArrayList<User>();
    }

    //STEP3:
    public ArrayList<Book> getBooks() {
        return books;
    }

    // TODO: addBook(Book book) — adds a book to the library's collection
    public void addBook(Book book){
        books.add(book);
    }
    // TODO: registerUser(User user) — adds a user to the registered users
    public void registerUser(User user){
        users.add(user);
    }

    // TODO: findBookByIsbn(String isbn) — returns the Book with matching ISBN, or null if not found
    public Book findBookByIsbn(String isbn){
        for (Book book: books){
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // TODO: findUserById(String id) — returns the User with matching ID, or null if not found
    public User findUserById(String id){
        for (User user: users){
            if(user.getId().equals(id)){
                return user;
            }
        } return null;
    }

    // TODO: borrowBook(String userId, String isbn)
    //       - Find user and book
    //       - If either not found, print "Invalid user or book"
    //       - If book not available, print "Book not available"
    //       - Otherwise, have user borrow the book and print "[userName] borrowed [bookTitle]"
    public void borrowBook(String userId, String isbn){
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);
        if(book==null || user == null){
            System.out.println("Invalid user or book");
            return;
        }
        if(!book.isAvailable()) {
            System.out.println("Book not available");
        } else {
            user.borrowBook(book);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        }
    }

    // TODO: returnBook(String userId, String isbn)
    //       - Find user and book
    //       - If either not found, print "Invalid user or book"
    //       - Otherwise, have user return the book and print "[userName] returned [bookTitle]"
    public void returnBook(String userId, String isbn){
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);
        if(book==null || user == null){
            System.out.println("Invalid user or book");
        } else {
            user.returnBook(book);
            System.out.println(user.getName() + " returned " + book.getTitle());
        }
    }
    //STEP4: TODO: Add searchByTitle(String keyword) method
    // Returns ArrayList<Book> of books whose title contains keyword (case-insensitive)
    public ArrayList<Book> searchByTitle(String keyword){
        ArrayList<Book> foundedBooks = new ArrayList<>();
        for(Book book: books){
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                foundedBooks.add(book);
        }
        return foundedBooks;
    }

    //STEP4: TODO: Add searchByAuthor(String keyword) method
    // Returns ArrayList<Book> of books whose author contains keyword (case-insensitive)
    public ArrayList<Book> searchByAuthor(String keyword){
        ArrayList<Book> foundedBooks = new ArrayList<>();
        for(Book book: books){
            if(book.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                foundedBooks.add(book);
        }
        return foundedBooks;
    }

    //STEP4: TODO: Add getAvailableBooks() method
    // Returns ArrayList<Book> of books that are currently available

    public ArrayList<Book> getAvailableBooks(){
        ArrayList<Book> availableBooks = new ArrayList<>();
        for(Book book: books){
            if(book.isAvailable())
                availableBooks.add(book);
        }
        return availableBooks;
    }
    //STEP5: TODO: Add removeBook(String isbn) method
    // Returns true if the book was found and is available, then removes it
    // Returns false if the book doesn't exist or is currently borrowed
    public boolean removeBook(String isbn){
        for(Book book: books){
            if(book.getIsbn().equals(isbn) && book.isAvailable()){
                return books.remove(book);
                //return true;
            }
        } return false;
    }

    //STEP5: TODO: Add getAllBooks() method
    // Returns the full list of books
    public ArrayList<Book> getAllBooks() {
        return books;
    }

}