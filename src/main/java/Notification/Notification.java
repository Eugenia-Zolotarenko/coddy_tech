package Notification;

// TODO: Create a sealed abstract class Notification
// - Use the 'sealed' keyword and 'permits' to allow only:
//   EmailNotification, SMSNotification, PushNotification
// - Add a protected field 'message' (String)
// - Add a constructor that initializes the message
// - Add a getter method getMessage()
// - Add an abstract method deliver() that returns String

sealed abstract class Notification permits EmailNotification, SMSNotification, PushNotification{
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    abstract String delivery();
}