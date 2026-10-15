package game.character;

// Interface defining combat capabilities
public interface Attackable {
    // TODO: Declare method attack(Character target) that returns a String
    String attack(Character target);

    // TODO: Declare method getDamageType() that returns a DamageType
    DamageType getDamageType();
}
