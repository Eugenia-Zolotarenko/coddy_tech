package Notification;
// TODO: Create a non-sealed class SMSNotification that extends Notification
// - Use the 'non-sealed' keyword to allow future extension
// - Add a private field 'phoneNumber' (String)
// - Add a constructor that takes message and phoneNumber
//   (call super(message) to initialize the parent)
// - Implement deliver() to return: "Sending SMS to [phoneNumber]: [message]"
public non-sealed class SMSNotification extends Notification{
    private String phoneNumber;

    public SMSNotification(String message, String phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    String delivery() {
        return "Sending SMS to " + phoneNumber + ": " + message;
    }
}
