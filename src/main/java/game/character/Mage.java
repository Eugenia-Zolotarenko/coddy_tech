package game.character;

// Mage class extending Character and implementing Attackable and Healable
public class Mage extends Character implements Attackable, Healable {
    // TODO: Add private fields: intelligence (int) and mana (int)
    private int intelligence, mana;

    // TODO: Create constructor that takes name, maxHealth, level, intelligence, and mana
    public Mage(String name, int maxHealth, int level, int intelligence, int mana) {
        super(name, maxHealth, level);
        this.intelligence = intelligence;
        this.mana = mana;
    }
    // TODO: Implement attack(Character target)
    // Damage = intelligence * 2
    // Follow same format as Warrior
    @Override
    public String attack(Character target) {
        int damage = intelligence*2;
        String damageResult = target.takeDamage(damage);

        return String.format("%s strikes with %s for %d damage!\n", getName(),
                getDamageType().getDescription(), damage) + damageResult;
    }
    // TODO: Implement getDamageType() to return MAGICAL
    @Override
    public DamageType getDamageType() {
        return DamageType.MAGICAL;
    }
    // TODO: Implement getCharacterClass() to return "Mage"
    @Override
    public String getCharacterClass() {
        return this.getClass().getSimpleName();
    }
    // TODO: Implement heal(int amount)
    // Restore health using setHealth
    // Return "[name] channels healing magic! Health: [health]/[maxHealth]"
        @Override
        public String heal(int amount) {
            setHealth(getHealth()+ amount);
            return getName() + " channels healing magic! Health: " +
                   getHealth() + "/" + getMaxHealth();
        }
}
