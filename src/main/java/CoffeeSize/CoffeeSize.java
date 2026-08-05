package CoffeeSize;

enum CoffeeSize {
    // TODO: Define enum constants SMALL, MEDIUM, LARGE with prices 2.50, 3.50, 4.50
    SMALL(2.50), MEDIUM(3.50), LARGE(4.50);
    // TODO: Add a private double field for price
    private double price;

    CoffeeSize(double price) {
        this.price = price;
    }
    // TODO: Add a constructor that takes a price parameter

    // TODO: Add a getPrice() method that returns the price
    public double getPrice() {
        return this.price;
    }
    // TODO: Add a getDescription() method that returns "[SIZE_NAME] - $[price]"
    public String getDescription(){
        return this.name() + " - $" + this.price;
    }
}
