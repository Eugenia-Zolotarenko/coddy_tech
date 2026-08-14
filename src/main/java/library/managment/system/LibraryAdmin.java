package library.managment.system;

// TODO: Create an interface called LibraryAdmin with three method declarations:
//   boolean addBook(String isbn, String title, String author)
//   boolean removeBook(String isbn)
//   boolean registerUser(String id, String name)
interface LibraryAdmin{
    boolean addBook(String isbn, String title, String author);
    boolean removeBook(String isbn);
    boolean registerUser(String id, String name);
}
// TODO: Create a class called AdminService that implements LibraryAdmin
//   - Hold a reference to a Library (passed through the constructor)
//   - Implement addBook: create a new Book and add it to the library, return true
//   - Implement removeBook: delegate to library.removeBook(isbn)
//   - Implement registerUser: create a new User and register them, return true
class AdminService implements LibraryAdmin{
    private Library library;

    public AdminService(Library library) {
        this.library = library;
    }

    @Override
    public boolean addBook(String isbn, String title, String author) {
        Book book = new Book(isbn, title, author);
        library.addBook(book);
        return true;
    }

    @Override
    public boolean removeBook(String isbn) {
        return library.removeBook(isbn);
    }

    @Override
    public boolean registerUser(String id, String name) {
        User user = new User(id, name);
        library.registerUser(user);
        return true;
    }
}
