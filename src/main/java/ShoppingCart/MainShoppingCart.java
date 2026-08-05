package ShoppingCart;

public class MainShoppingCart {


    public static void main(String[] args) {
        // Read inputs
        String customerName = "Jack";
        String itemName = "Watch";
        double itemPrice = 199.0;

        double discount = 10.0;

        // TODO: Create a ShoppingCart with the customer name
        ShoppingCart cart = new ShoppingCart(customerName);

        // TODO: Create an Item using: cart.new Item(itemName, itemPrice)
        ShoppingCart.Item item = cart.new Item(itemName, itemPrice);

        // TODO: Call checkout() with the item and discount, then print the result
        System.out.println(cart.checkout(item, discount));


    }
}