package ZooFeedingSystem;

// Base class for all food types
class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // TODO: Override toString() to return the food's name

    @Override
    public String toString() {
        return name;
    }
}

// TODO: Create Meat class that extends Food

class Meet extends Food {

    public Meet(String name) {
        super(name);
    }
}

// TODO: Create Vegetable class that extends Food
class Vegetable extends Food {

    public Vegetable(String name) {
        super(name);
    }
}