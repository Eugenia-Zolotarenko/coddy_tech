package ZooFeedingSystem;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        String meatName = "Chicken";
        String vegetableName = "Carrot";

        // TODO: Create an ArrayList<Food> and add Meat and Vegetable objects
        List<Food> foods = new ArrayList<>();
        foods.add(new Meet(meatName));
        foods.add(new Vegetable(vegetableName));


        // TODO: Print "Food inventory:" then call printInventory
        System.out.println("Food inventory:");
        ZooFeeder.printInventory(foods);

        // TODO: Print blank line, then "Total food items: [count]" using calculateTotalFood
        System.out.println();
        System.out.println("Total food items: " + ZooFeeder.calculateTotalFood(foods));
        // TODO: Create new ArrayList<Food> called meatStock

        List<Food> meatStock = new ArrayList<>();

        // TODO: Print blank line, then "Adding to meat stock..."
        System.out.println();
        System.out.println("Adding to meat stock...");

        // TODO: Call addMeatToStock with meatStock and "Beef"
        ZooFeeder.addMeatToStock(meatStock, "Beef");

        // TODO: Print "Meat stock after adding:" then call printInventory on meatStock
        System.out.println("Meat stock after adding: ");
        ZooFeeder.printInventory(meatStock);
    }
}
