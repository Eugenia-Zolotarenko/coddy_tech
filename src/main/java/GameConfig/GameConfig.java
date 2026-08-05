package GameConfig;

class GameConfig {
    // TODO: Declare private static array levelThresholds (int[])
    private static int[] levelThresholds;

    // TODO: Declare private static variable maxLevel (int)
    private static int maxLevel;

    // TODO: Declare private static variable configLoaded (boolean)
    private static boolean configLoaded;

    // TODO: First static block
    // - Initialize maxLevel to 5
    // - Print "Initializing game configuration..."
    static {
        maxLevel = 5;
        System.out.println("Initializing game configuration...");
    }

    // TODO: Second static block
    // - Create levelThresholds array with size equal to maxLevel
    // - Fill it so each level requires level * 100 points
    //   (level 1 needs 100, level 2 needs 200, etc.)
    // - Set configLoaded to true
    static {
        levelThresholds = new int[maxLevel+1];
        for (int i = 0; i < levelThresholds.length; i++) {
            levelThresholds[i] = i*100;
        }
        configLoaded = true;
    }

    // TODO: Implement getThreshold(int level) method
    // Returns the score threshold for that level (levels are 1-indexed)
    public static int getThreshold(int level) {
        return levelThresholds[level]; // Replace with correct implementation
    }

    // TODO: Implement getMaxLevel() method
    // Returns the maximum level
    public static int getMaxLevel() {
        return maxLevel; // Replace with correct implementation
    }

    // TODO: Implement isConfigLoaded() method
    // Returns whether the config has been loaded
    public static boolean isConfigLoaded() {
        return configLoaded; // Replace with correct implementation
    }
}
