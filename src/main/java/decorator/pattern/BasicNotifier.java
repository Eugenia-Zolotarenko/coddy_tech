package decorator.pattern;

// BasicNotifier - the concrete component class
// This is the simplest form of notification (in-app alert)

class BasicNotifier implements Notifier {
    // TODO: Implement the send method
    // It should print: In-App: [message]
    @Override
    public void send(String message) {
        System.out.println("In-App: " + message);
    }
}