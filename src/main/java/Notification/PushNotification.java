package Notification;
// TODO: Create a final class PushNotification that extends Notification
// - Use the 'final' keyword since this is a permitted subclass
// - Add a private field 'deviceId' (String)
// - Add a constructor that takes message and deviceId
//   (call super(message) to initialize the parent)
// - Implement deliver() to return: "Sending push to device [deviceId]: [message]"


public final class PushNotification extends Notification{
    private String deviceId;

    public PushNotification(String message, String deviceId) {
        super(message);
        this.deviceId = deviceId;
    }

    @Override
    String delivery() {
        return "Sending push to device " + deviceId + ": " + message;
    }
}
