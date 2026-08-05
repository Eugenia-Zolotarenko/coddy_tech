package AppConfig;

class AppConfig {
    // TODO: Create a private static field to hold the single instance
    private static AppConfig instance;

    // TODO: Create private fields for appName (String) and maxUsers (int)
    private String appName;
    private int maxUsers;

    // TODO: Create a private constructor that:
    // - Initializes appName to "MyApplication"
    // - Initializes maxUsers to 100
    // - Prints "AppConfig initialized"

    private AppConfig() {
        this.maxUsers = 100;
        this.appName = "MyApplication";
        System.out.println("AppConfig initialized");
    }
    // TODO: Create a public static getInstance() method that:
    // - Creates the instance only if it doesn't exist (lazy initialization)
    // - Returns the instance
    public static AppConfig getInstance() {
        if(instance == null)
            instance = new AppConfig();
        return instance;
    }
    // TODO: Create setAppName(String name) method to update appName

    public void setAppName(String appName) {
        this.appName = appName;
    }
    // TODO: Create setMaxUsers(int max) method to update maxUsers

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    // TODO: Create displaySettings() method that prints:
    // "App: [appName], Max Users: [maxUsers]"
    public void displaySettings(){
        System.out.println("App: " + appName + ", Max Users: " + maxUsers );
    }
}