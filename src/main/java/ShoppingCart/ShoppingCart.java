package ShoppingCart;

class ShoppingCart {
    // TODO: Add private field for customerName
    private String customerName;
    // TODO: Create constructor that takes customerName
    public ShoppingCart(String customerName){
        this.customerName = customerName;
    }
    // TODO: Create nested inner class Item with:
    //       - private fields: name (String), price (double)
    //       - constructor to initialize both fields
    //       - getDetails() method that returns: "[name]: $[price]"
    class Item{
        private String name;
        private double price;
        public Item(String name, double price){
            this.name = name;
            this.price = price;
        }

        String getDetails(){
            return this.name + ": $" + this.price;
        }
    }
    // TODO: Create checkout method that takes an Item and discount percentage (double)
    //       Inside checkout():
    //       1. Create a local inner class DiscountCalculator with method:
    //          applyDiscount(double originalPrice) - returns price after discount
    //       2. Use DiscountCalculator to calculate the final price
    //       3. Create an anonymous inner class implementing Formatter
    //          to format and return the receipt string:
    //          --- Receipt ---
    //          Customer: [customerName]
    //          Item: [item details]
    //          Discount: [discount]%
    //          Final Price: $[calculated price]

    public String checkout(Item item, double discount){
        class DiscountCalculator {
            double applyDiscount(double originalPrice) {
                double d = originalPrice * discount / 100;
                return originalPrice - d;
            }

            double finalPrice = applyDiscount(item.price);
        }

        Formatter formatter = new Formatter() {
            @Override
            public String format() {
                return "--- Receipt ---\n" +
                       "Customer: " + customerName + "\n" +
                       "Item: " + item.getDetails() + "\n" +
                       "Discount: " + discount + "%" + "\n" +
                       "Final Price: $" + new DiscountCalculator().finalPrice;
                }
        };
        return formatter.format();
    }
}
