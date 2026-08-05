class Book {
    // TODO: Declare instance variable 'title' (String)
    private String title;


    // TODO: Declare instance variable 'price' (double)
    private double price;
    // TODO: Declare static variable 'totalBooks' (int) - shared across all Book objects
    private static  int totalBooks;

    // TODO: Create constructor that takes title and price
    // Don't forget to increment totalBooks when a new book is created

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        totalBooks++;
    }


    // TODO: Create getter getTitle() that returns the title

    public String getTitle() {
        return this.title;
    }


    // TODO: Create getter getPrice() that returns the price

    public double getPrice() {
        return this.price;
    }


    // TODO: Create static method getTotalBooks() that returns the total number of books
    public static int getTotalBooks(){
        return totalBooks;
    }
}
