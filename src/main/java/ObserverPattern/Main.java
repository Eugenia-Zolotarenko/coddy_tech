package ObserverPattern;

class Main {
    public static void main(String[] args) {


        // Read inputs
        String stockName = "AAPL";
        double firstPrice = 150.50;
        double secondPrice = 155.75;

        // TODO: Create a StockTicker with the given stock name
        StockTicker stockTicker = new StockTicker(stockName);

        // TODO: Create a DayTrader named "Alice"
        DayTrader dayTrader = new DayTrader("Alice");

        // TODO: Create a LongTermInvestor named "Bob"
        LongTermInvestor longTermInvestor = new LongTermInvestor("Bob");

        // TODO: Subscribe both Alice and Bob to the ticker
        stockTicker.subscribe(dayTrader);
        stockTicker.subscribe(longTermInvestor);

        // TODO: Set the price to firstPrice (both observers get notified)
        stockTicker.setCurrentPrice(firstPrice);

        // TODO: Unsubscribe Alice
        stockTicker.unsubscribe(dayTrader);

        // TODO: Set the price to secondPrice (only Bob gets notified)
        stockTicker.setCurrentPrice(secondPrice);
    }
}

