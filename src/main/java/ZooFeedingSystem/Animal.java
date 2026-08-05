package ZooFeedingSystem;

// Base class for all animals
class Animal {
    private String species;

    // TODO: Create constructor that initializes species

    public Animal(String species) {
        this.species = species;
    }

    // TODO: Create getSpecies() method

    public String getSpecies() {
        return species;
    }
}

// TODO: Create Carnivore class that extends Animal
class  Carnivore extends Animal{

    public Carnivore(String species) {
        super(species);
    }
}

// TODO: Create Herbivore class that extends Animal

class Herbivore extends Animal{

    public Herbivore(String species) {
        super(species);
    }
}
