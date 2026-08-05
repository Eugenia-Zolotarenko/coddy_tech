package Notification;
// TODO: Create a final class EmailNotification that extends Notification
// - Use the 'final' keyword since this is a permitted subclass
// - Add a private field 'recipient' (String) for the email address
// - Add a constructor that takes message and recipient
//   (call super(message) to initialize the parent)
// - Implement deliver() to return: "Sending email to [recipient]: [message]"

public final class EmailNotification extends  Notification{
    private String  recipient;

    public EmailNotification(String message, String recipient) {
        super(message);
        this.recipient = recipient;
    }

    @Override
    String delivery() {
        return "Sending email to " + recipient + ": " + message;
    }
}
