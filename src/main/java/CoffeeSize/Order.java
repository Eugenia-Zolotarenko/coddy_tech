package CoffeeSize;

class Order {
    // TODO: Add private fields for customerName (String) and size (CoffeeSize)
    private String customerName;
    private CoffeeSize size;
    // TODO: Add a constructor that initializes both fields

    public Order(String customerName, CoffeeSize size) {
        this.customerName = customerName;
        this.size = size;
    }

    // TODO: Add getter methods for customerName and size

    public String getCustomerName() {
        return customerName;
    }

    public CoffeeSize getSize() {
        return size;
    }

    // TODO: Add a getReceipt() method that returns a multi-line string:
    // "Order for: [customerName]
    // Size: [size description]
    // Total: $[price]"
    public String getReceipt(){
        return "Order for: " + this.customerName + "\n" +
                "Size: " + size.getDescription() + "\n" +
                "Total: $" + size.getPrice();
    }

}
