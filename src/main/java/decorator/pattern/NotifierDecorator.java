package decorator.pattern;

// NotifierDecorators - contains the decorator hierarchy

// Abstract decorator class that implements Notifier
abstract class NotifierDecorator implements Notifier {
    // TODO: Add a protected field to hold the wrapped Notifier
    protected Notifier notifier;
    // TODO: Create a constructor that accepts a Notifier to wrap
    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
}

// EmailDecorator - adds email notification capability
class EmailDecorator extends NotifierDecorator {
    // TODO: Create constructor that passes notifier to parent
    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }
    // TODO: Implement send method
    // First delegate to wrapped notifier, then print: Email: [message]
    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Email: " + message);
    }
}

// SMSDecorator - adds SMS notification capability
class SMSDecorator extends NotifierDecorator {
    // TODO: Create constructor that passes notifier to parent
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }
    // TODO: Implement send method
    // First delegate to wrapped notifier, then print: SMS: [message]
    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("SMS: " + message);
    }
}

// PushDecorator - adds push notification capability
class PushDecorator extends NotifierDecorator {
    // TODO: Create constructor that passes notifier to parent
    public PushDecorator(Notifier notifier) {
        super(notifier);
    }
    // TODO: Implement send method
    // First delegate to wrapped notifier, then print: Push: [message]
    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Push: " + message);
    }
}
