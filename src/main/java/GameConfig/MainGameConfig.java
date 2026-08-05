package GameConfig;

public class MainGameConfig {
    public static void main(String[] args) {

        int level = 5;

        // TODO: Access GameConfig to demonstrate static block execution
        // The static blocks in GameConfig will run automatically when you first access the class


        // TODO: Print whether config is loaded
        // Format: "Config loaded: true" or "Config loaded: false"
        System.out.println("Config loaded: " + GameConfig.isConfigLoaded());


        // TODO: Print the max level
        // Format: "Max level: [maxLevel]"
        System.out.println("Max level: " + GameConfig.getMaxLevel());

        // TODO: Print the threshold for the input level
        // Format: "Level [level] threshold: [threshold]"
        System.out.println("Level " +  level + " threshold: " + GameConfig.getThreshold(level));


        // TODO: Print the threshold for level 1
        // Format: "Level 1 threshold: [threshold]"
        System.out.println("Level 1 threshold: " + GameConfig.getThreshold(1));

    }
}
