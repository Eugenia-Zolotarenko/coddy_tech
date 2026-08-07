package decorator.pattern;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Read the message to send
        String message = "Hello";
        message = "Server is down!";
        message = "Alert!";
        message = "Backup complete";
        // Read the comma-separated list of channels (e.g., "email,sms" or "push,email,sms")
        String channelsInput = "email";
         channelsInput = "sms";
         channelsInput = "push,sms,email";

        // TODO: Start with a BasicNotifier
        Notifier notifier = new BasicNotifier();

        // TODO: Split the channels input by comma
        String[] channels = channelsInput.split(",");

        // TODO: Loop through each channel and wrap the notifier with the appropriate decorator
        // Valid channels are: "email", "sms", "push"
        for (String channel: channels){
            switch (channel){
                case "email"->  notifier = new EmailDecorator(notifier);
                case "sms"->    notifier = new SMSDecorator(notifier);
                case "push"->   notifier = new PushDecorator(notifier);
                default -> System.out.println("Wrong channel");
            }
        }
        // TODO: Call send on the fully decorated notifier with the message
        notifier.send(message);
    }
}
