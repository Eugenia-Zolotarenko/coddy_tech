package Notification;

public class MainNotification {
    public static void main(String[] args) {

        // Read the four inputs
        String message = "Hello";
        String email = "user@example.com";
        String phoneNumber = "555-1234";
        String deviceId = "device001";

        // TODO: Create one of each notification type using the same message
        // - EmailNotification with message and email
        // - SMSNotification with message and phoneNumber
        // - PushNotification with message and deviceId
        EmailNotification emailNotification = new EmailNotification(message, email);
        SMSNotification smsNotification = new SMSNotification(message, phoneNumber);
        PushNotification pushNotification = new PushNotification(message, deviceId);

        // TODO: Store all three notifications in a Notification[] array
        // This demonstrates polymorphism with sealed classes
        Notification[] notifications = {emailNotification, smsNotification, pushNotification};

        // TODO: Iterate through the array and print the result of deliver()
        // for each notification
        for(Notification note: notifications){
            System.out.println(note.delivery());
        }

    }
}
