package ZooFeedingSystem;

import java.util.List;

class ZooFeeder {

    // TODO: Create printInventory method using unbounded wildcard (?)
    // This method should print each item in the list on its own line
    public static void printInventory(List<?> items){
        for (Object item: items){
            System.out.println(item.toString());
        }
    }


    // TODO: Create calculateTotalFood method using upper bounded wildcard (? extends Food)
    // This method should return the count of items in the list
    public static int calculateTotalFood (List<? extends Food> foods){
        return foods.size();
    }


    // TODO: Create addMeatToStock method using lower bounded wildcard (? super Meat)
    // This method should create a new Meat object and add it to the stock
    public static void addMeatToStock(List<? super Meet> stock, String meatName){
        Meet meet = new Meet(meatName);
        stock.add(meet);
    }
}
