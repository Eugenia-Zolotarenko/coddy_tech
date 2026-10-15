package game.character;

// Abstract base class for all game characters
public abstract class Character {
    // TODO: Add private fields: name (String), health (int), maxHealth (int), level (int)
    private String name;
    private int health;
    private int maxHealth;
    private int level;

    // TODO: Create constructor that takes name, maxHealth, and level
    // Set health equal to maxHealth initially
    public Character(String name, int maxHealth, int level) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.level = level;
        this.health = maxHealth;
    }

    // TODO: Add getters for all fields
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getLevel() {
        return level;
    }

    // TODO: Add protected method setHealth(int health)
    // Ensure health stays between 0 and maxHealth
    protected void setHealth(int health){
        if(health < 0)
            this.health = 0;
        else  if(health > this.maxHealth)
            this.health = this.maxHealth;
        else this.health = health;
    }

    // TODO: Create method takeDamage(int damage)
    // Reduces health and returns "[name] takes [damage] damage! Health: [health]/[maxHealth]"
    public String takeDamage(int damage){
        setHealth(this.health - damage);
        return name + " takes " + damage +" damage! Health: " + health + "/" + maxHealth;
    }

    // TODO: Add method isAlive() returning true if health > 0
    public boolean isAlive(){
        if (this.health > 0)
            return true;
        return false;
    }

    // TODO: Declare abstract method getCharacterClass() returning a String
    public abstract String getCharacterClass();

    public String attack(Character target){
        return "";
    }
}
