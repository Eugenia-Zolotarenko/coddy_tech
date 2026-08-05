package CoffeeSize;

public class MainCoffeeSize {
    public static void main(String[] args) {
        // Read inputs
        String customerName = "Alice";
        String sizeName = "SMALL";

        // TODO: Convert sizeName to CoffeeSize enum using valueOf()
        CoffeeSize size = CoffeeSize.valueOf(sizeName);

        // TODO: Create an Order with the customer name and size
        Order order = new Order(customerName,size);

        // TODO: Print the receipt\
        System.out.println(order.getReceipt());

        // TODO: Print an empty line
        System.out.println();

        // TODO: Display the full menu by iterating through all CoffeeSize values
        // Hint: Use CoffeeSize.values() to get all enum constants
        for (CoffeeSize size1: CoffeeSize.values()){
            System.out.println(size1.name() + " - $" + size1.getPrice());
        }
    }
}
