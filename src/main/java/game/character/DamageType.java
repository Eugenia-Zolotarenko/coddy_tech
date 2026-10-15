package game.character;

// Enum representing different types of damage in the game
public enum DamageType {
    // TODO: Define enum values PHYSICAL, MAGICAL, and RANGED
    // Each should have a description:
    // - PHYSICAL: "brute force"
    // - MAGICAL: "arcane energy"
    // - RANGED: "precision strike"
    PHYSICAL("brute force"),
    MAGICAL ("arcane energy"),
    RANGED  ("precision strike");

    // TODO: Add private field 'description' (String)
    private String description;

    // TODO: Add constructor that sets the description
    DamageType(String description) {
        this.description = description;
    }

    // TODO: Add getter for description
    public String getDescription() {
        return description;
    }
}
