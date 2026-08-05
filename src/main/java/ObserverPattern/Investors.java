package ObserverPattern;

// DayTrader class - implements Observer
// TODO: Implement the Observer interface
class DayTrader implements Observer{

    // TODO: Add private field for name
    public String name;

    // TODO: Create constructor that takes name as parameter

    public DayTrader(String name) {
        this.name = name;
    }

    // TODO: Implement update method
    // Print: "[name] received alert: [stockName] is now $[price] - Making quick trade!"
    // Format price with two decimal places using String.format("%.2f", price)
    @Override
    public void update(String stockName, double price) {
        System.out.printf("%s received alert: %s is now $%.2f - Making quick trade!\n",
                            name, stockName, price);
    }
}

// LongTermInvestor class - implements Observer
// TODO: Implement the Observer interface
class LongTermInvestor implements Observer{
    // TODO: Add private field for name
    private String name;

    // TODO: Create constructor that takes name as parameter

    public LongTermInvestor(String name) {
        this.name = name;
    }
    // TODO: Implement update method
    // Print: "[name] received alert: [stockName] is now $[price] - Holding steady."
    // Format price with two decimal places using String.format("%.2f", price)
    @Override
    public void update(String stockName, double price) {
        System.out.printf("%s received alert: %s is now $%.2f - Holding steady.\n",
                name, stockName, price);
    }
}
