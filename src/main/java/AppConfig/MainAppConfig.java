package AppConfig;

public class MainAppConfig {
    public static void main(String[] args) {

        // Read inputs
        String newAppName = "EnterpriseSystem";
        int newMaxUsers = 2147483647;

        // TODO: Get first instance of AppConfig and store in config1
        AppConfig config1 = AppConfig.getInstance();

        // TODO: Call displaySettings() on config1 to show default values
        config1.displaySettings();

        // TODO: Update settings using setAppName and setMaxUsers on config1
        config1.setAppName(newAppName);
        config1.setMaxUsers(newMaxUsers);

        // TODO: Get another instance and store in config2
        AppConfig config2 = AppConfig.getInstance();

        // TODO: Call displaySettings() on config2 to prove changes are shared
        config2.displaySettings();

        // TODO: Print whether both references point to same object:
        // "Same instance: [true/false]" using config1 == config2
        System.out.println(config1 == config2 ? "Same instance: true" : "Same instance: false");
    }
}
