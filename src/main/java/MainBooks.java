import java.util.Scanner;

class MainBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs for three books
        String title1 = "The Hobbit";
        double price1 = 12.99;
        String title2 = "1984";
        double price2 = 9.99;
        String title3 = "Dune";
        double price3 = 14.50;

        // TODO: Create three Book objects using the inputs above
        Book book1= new Book(title1,price1);
        Book book2 = new Book(title2,price2);
        Book book3 = new Book(title3,price3);

        // TODO: Print each book's title and price in format: [title]: $[price]
        // Use String.format("%.2f", price) for formatting the price to 2 decimal places
        System.out.printf("%s: $%.2f\n", book1.getTitle(), book1.getPrice());
        System.out.printf("%s: $%.2f\n", book2.getTitle(), book2.getPrice());
        System.out.printf("%s: $%.2f\n", book3.getTitle(), book3.getPrice());


        // TODO: Print the total number of books using the static method
        // Format: Total books: [count]
        // Remember to access static method through class name: Book.getTotalBooks()

        System.out.println("Total books: " + Book.getTotalBooks());
    }
}
