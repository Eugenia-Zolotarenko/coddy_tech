package game.character;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {

        String input = "CREATE_WARRIOR:Thorin:100:5:15,CREATE_MAGE:Gandalf:80:7:12:50,ATTACK:Thorin:Gandalf,HEAL:Gandalf:25,STATUS:Gandalf";
        input = "CREATE_WARRIOR:Knight:50:1:10";
        input = "CREATE_MAGE:Merlin:60:3:8:30";
        input = "CREATE_WARRIOR:Conan:120:10:20,ATTACK:Conan:Conan,STATUS:Conan";
        input = "CREATE_MAGE:Elara:70:5:15:40,ATTACK:Elara:Elara,HEAL:Elara:50,STATUS:Elara";
        input = "CREATE_WARRIOR:Ragnar:80:3:12,CREATE_WARRIOR:Bjorn:90:4:14,ATTACK:Ragnar:Bjorn,ATTACK:Bjorn:Ragnar,STATUS:Ragnar,STATUS:Bjorn";
        input = "CREATE_WARRIOR:Tank:200:8:25,CREATE_MAGE:Healer:50:6:10:100,ATTACK:Tank:Healer,ATTACK:Tank:Healer,HEAL:Healer:30,STATUS:Healer";
        input = "CREATE_WARRIOR:Brute:100:5:18,HEAL:Brute:20";
        input = "CREATE_MAGE:Wizard:40:2:20:25,CREATE_WARRIOR:Slayer:150:10:30,ATTACK:Slayer:Wizard,STATUS:Wizard,ATTACK:Slayer:Wizard,STATUS:Wizard";
        //input = "CREATE_WARRIOR:Alpha:100:5:15,CREATE_WARRIOR:Beta:100:5:15,CREATE_MAGE:Gamma:80:7:12:50,CREATE_MAGE:Delta:80:7:12:50,ATTACK:Alpha:Gamma,ATTACK:Beta:Delta,ATTACK:Gamma:Alpha,ATTACK:Delta:Beta,HEAL:Gamma:30,HEAL:Delta:30,STATUS:Alpha,STATUS:Beta,STATUS:Gamma,STATUS:Delta";

        // TODO: Use a collection to maintain characters (LinkedHashMap preserves insertion order)
        // LinkedHashMap<String, Character> characters = new LinkedHashMap<>();
        LinkedHashMap<String, Character> characters = new LinkedHashMap<>();

        // TODO: Split input by comma to get individual commands
        // String[] commands = input.split(",");
        String[] commands = input.split(",");

        // TODO: Process each command:
        // - CREATE_WARRIOR:name:maxHealth:level:strength
        //   Print: "[name] the Warrior joins the battle!"
        //
        // - CREATE_MAGE:name:maxHealth:level:intelligence:mana
        //   Print: "[name] the Mage joins the battle!"
        //
        // - ATTACK:attackerName:targetName
        //   Print the attack result from the attack method
        //
        // - HEAL:mageName:amount
        //   Print heal result, or "[name] cannot heal" if not a Mage
        //
        // - STATUS:characterName
        //   Print: "[name] ([characterClass]) - Level [level] - Health: [health]/[maxHealth] - [Alive/Defeated]"
        for(String command : commands){
            String[] actions  = command.split(":");
            String name = actions[1];
            switch (actions[0]){
                case "CREATE_WARRIOR" -> {
                    int health = Integer.parseInt(actions[2]);
                    int level = Integer.parseInt(actions[3]);
                    int strength = Integer.parseInt(actions[4]);

                    Warrior warrior = new Warrior(name, health, level, strength);
                    characters.put(name, warrior);
                    System.out.println(warrior.getName() + " the Warrior joins the battle!");
                }
                case "CREATE_MAGE" -> {
                    int health = Integer.parseInt(actions[2]);
                    int level = Integer.parseInt(actions[3]);
                    int intelligence = Integer.parseInt(actions[4]);
                    int mana = Integer.parseInt(actions[5]);

                    Mage mage = new Mage(name, health, level, intelligence ,mana);
                    characters.put(name, mage);
                    System.out.println(mage.getName() + " the Mage joins the battle!");
                }
                // - ATTACK:attackerName:targetName
                //   Print the attack result from the attack method
                case "ATTACK" -> {
                   String targetName = actions[2];
                   String attackResult = characters.get(name).attack(characters.get(targetName));
                   System.out.println(attackResult);
                }
                // - HEAL:mageName:amount
                //   Print heal result, or "[name] cannot heal" if not a Mage
                case "HEAL" -> {
                    int amount = Integer.parseInt(actions[2]);
                    if(characters.get(name) instanceof Mage) {
                        String healResult = ((Mage) characters.get(name)).heal(amount);
                        System.out.println(healResult);
                    } else System.out.println(name + " cannot heal");
                }
                // - STATUS:characterName
                //   Print: "[name] ([characterClass]) - Level [level] - Health: [health]/[maxHealth] - [Alive/Defeated]"
                case "STATUS" -> {
                    String characterClass = characters.get(name).getCharacterClass();
                    int level = characters.get(name).getLevel();
                    int health = characters.get(name).getHealth();
                    int maxHealth = characters.get(name).getMaxHealth();
                    String isAlive = (characters.get(name).isAlive())? "Alive" : "Defeated";
                    System.out.printf("%s (%s) - Level %d - Health: %d/%d - %s\n",
                            name, characterClass, level, health, maxHealth, isAlive);
                }
                default -> System.out.println("Invalid command");

            }
        }

        // TODO: After all commands, print "--- Battle Summary ---"
        // Then print each character's status
        System.out.println("--- Battle Summary ---");
        for (String name : characters.keySet()){
            String characterClass = characters.get(name).getCharacterClass();
            int level = characters.get(name).getLevel();
            int health = characters.get(name).getHealth();
            int maxHealth = characters.get(name).getMaxHealth();
            String isAlive = (characters.get(name).isAlive())? "Alive" : "Defeated";
            System.out.printf("%s (%s) - Level %d - Health: %d/%d - %s\n",
                    name, characterClass, level, health, maxHealth, isAlive);
        }
    }
}
