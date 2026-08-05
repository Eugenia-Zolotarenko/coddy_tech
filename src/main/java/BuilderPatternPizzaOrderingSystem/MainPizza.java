package BuilderPatternPizzaOrderingSystem;

public class MainPizza {
    public static void main(String[] args) {

        // Read inputs
//        String size = "Small";
//        String addCheese = "no";
//        String addPepperoni = "no";
//        String addMushrooms = "no";

//        String size = "Medium";
//        String addCheese = "yes";
//        String addPepperoni = "no";
//        String addMushrooms = "no";

//        String size = "Large";
//        String addCheese = "no";
//        String addPepperoni = "yes";
//        String addMushrooms = "no";

//        String size = "Small";
//        String addCheese = "no";
//        String addPepperoni = "no";
//        String addMushrooms = "yes";

//        String size = "Large";
//        String addCheese = "yes";
//        String addPepperoni = "no";
//        String addMushrooms = "yes";

//        String size = "Medium";
//        String addCheese = "yes";
//        String addPepperoni = "yes";
//        String addMushrooms = "no";

//                String size = "Small";
//        String addCheese = "no";
//        String addPepperoni = "yes";
//        String addMushrooms = "yes";

//                String size = "Large";
//        String addCheese = "yes";
//        String addPepperoni = "yes";
//        String addMushrooms = "yes";
//
//        String size = "Extra Large";
//        String addCheese = "yes";
//        String addPepperoni = "yes";
//        String addMushrooms = "yes";


        String size = "Personal";
        String addCheese = "yes";
        String addPepperoni = "no";
        String addMushrooms = "no";

        // TODO: Create a PizzaBuilder with the given size
        // TODO: Chain topping methods based on yes/no inputs
        // TODO: Build the pizza and print its description
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder(size);
        if(addCheese.equals("yes")) pizzaBuilder.cheese();
        if(addPepperoni.equals("yes")) pizzaBuilder.pepperoni();
        if(addMushrooms.equals("yes")) pizzaBuilder.mushrooms();
        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza.getDescription());

    }
}
