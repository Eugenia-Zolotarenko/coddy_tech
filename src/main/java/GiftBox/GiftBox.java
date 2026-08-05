package GiftBox;

public class GiftBox<T> {
    // TODO: Declare private field 'item' of type T
    // TODO: Declare private field 'wrapped' (boolean) initialized to false
    private T item;
    private boolean wrapped = false;
    // TODO: Create constructor that accepts the item

    public GiftBox(T item) {
        this.item = item;
    }

    // TODO: Implement getItem() method that returns the item

    public T getItem() {
        return item;
    }

    // TODO: Implement wrap() method that sets wrapped to true
    public void wrap(){
        wrapped = true;
    }

    // TODO: Implement isWrapped() method that returns the wrapped status
    public boolean isWrapped(){
        return wrapped;
    }
    // TODO: Implement getStatus() method that returns:
    // "[item] (wrapped)" or "[item] (unwrapped)" depending on wrapped state
    public String getStatus(){
        return (wrapped)? item + " (wrapped)" : item + " (unwrapped)";
    }
}
