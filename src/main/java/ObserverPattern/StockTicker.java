package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// StockTicker is the Subject in the Observer Pattern
class StockTicker {
    // TODO: Add private field for stock name (String)
    // TODO: Add private field for current price (double, initially 0)
    // TODO: Add private list to store observers
    private String stockName;
    private double currentPrice = 0;
    private List<Observer> storeObservers = new ArrayList<>();

    // TODO: Create constructor that takes stock name as parameter
    public StockTicker(String stockName){
        this.stockName = stockName;
    }

    // TODO: Implement subscribe(Observer observer) method
    // - Add the observer to the list
    public void subscribe(Observer observer){
        storeObservers.add(observer);
    }

    // TODO: Implement unsubscribe(Observer observer) method
    // - Remove the observer from the list
    public void unsubscribe(Observer observer){
        storeObservers.remove(observer);
    }

    // TODO: Implement setPrice(double price) method
    // - Update the price
    // - Notify all observers by calling their update method

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
        for (Observer store: storeObservers){
            store.update(this.stockName, currentPrice);
        }
    }
}