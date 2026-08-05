package GenericBox;

public class GenericBox<T> {
    // TODO: Declare a private field 'content' of type T
    private T content;

    // TODO: Create a constructor that accepts a T value and stores it

    public GenericBox(T content) {
        this.content = content;
    }

    // TODO: Create a getContent() method that returns type T

    public T getContent() {
        return content;
    }
}
