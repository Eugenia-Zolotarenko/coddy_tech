package BuilderPatternPizzaOrderingSystem;


class Pizza {
    // TODO: Declare private fields for size, cheese, pepperoni, mushrooms
    private String size;
    private boolean cheese,
                    pepperoni,
                    mushrooms;

    // TODO: Create a private constructor that accepts a PizzaBuilder
    // and copies all values from the builder to the pizza's fields
    private Pizza(PizzaBuilder builder){
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    // TODO: Implement getDescription() method
    // Format: "[size] Pizza with: [toppings]"
    // Toppings should be comma-separated (Cheese, Pepperoni, Mushrooms)
    // If no toppings, say "no toppings"
    public String getDescription(){
        String result = this.size + " Pizza with: ";
        if(!this.cheese && !this.pepperoni && !this.mushrooms ) {
            result = result + "no toppings";
        }  else {
            if (this.cheese) result = result + "Cheese" + ", ";
            if (this.pepperoni) result = result + "Pepperoni" + ", ";
            if (this.mushrooms) result = result + "Mushrooms";
            if (result.endsWith(", ")) result = result.substring(0, result.length() - 2);
        }
        return result;
    }

    // TODO: Create a static inner class PizzaBuilder
    // - Constructor takes required size parameter
    // - cheese() method sets cheese to true, returns this
    // - pepperoni() method sets pepperoni to true, returns this
    // - mushrooms() method sets mushrooms to true, returns this
    // - build() method returns a new Pizza

    public static class PizzaBuilder {
        // TODO: Declare fields matching Pizza fields
        private String size;
        private boolean cheese,
                pepperoni,
                mushrooms;

        // TODO: Constructor with size parameter

        public PizzaBuilder(String size) {
            this.size = size;
        }

        // TODO: Implement cheese(), pepperoni(), mushrooms() methods
        // Each should set the boolean to true and return this
        public PizzaBuilder cheese(){
            this.cheese = true;
            return this;
        }

        public PizzaBuilder pepperoni(){
            this.pepperoni = true;
            return this;
        }

        public PizzaBuilder mushrooms(){
            this.mushrooms = true;
            return this;
        }

        // TODO: Implement build() method that returns new Pizza(this)
        public Pizza build(){
            return new Pizza(this);
        }
    }
}