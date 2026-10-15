package game.character;

// Warrior class extending Character and implementing Attackable
public class Warrior extends Character implements Attackable {
    // TODO: Add private field strength (int)
    private int strength;

    // TODO: Create constructor that takes name, maxHealth, level, and strength
    public Warrior(String name, int maxHealth, int level, int strength) {
        super(name, maxHealth, level);
        this.strength = strength;
    }

    // TODO: Implement attack(Character target)
    // Damage = strength + level
    // Call target's takeDamage method
    // Return "[name] strikes with [damageType description] for [damage] damage!"
    // followed by newline and the takeDamage result
    @Override
    public String attack(Character target) {
        int damage = strength + getLevel();
        String damageResult = target.takeDamage(damage);

        return String.format("%s strikes with %s for %d damage!\n", getName(),
                getDamageType().getDescription(), damage) + damageResult;
    }

    // TODO: Implement getDamageType() to return PHYSICAL
    @Override
    public DamageType getDamageType() {
        return DamageType.PHYSICAL;
    }
    // TODO: Implement getCharacterClass() to return "Warrior"
    @Override
    public String getCharacterClass() {
        return this.getClass().getSimpleName(); //return "Warrior"
    }
}
