package GiftBox;

public class Registry<K,V> {
    // TODO: Declare private field 'recipient' of type K
    // TODO: Declare private field 'gift' of type V
    private K recipient;
    private V gift;
    // TODO: Create constructor that accepts both values

    public Registry(K recipient, V gift) {
        this.recipient = recipient;
        this.gift = gift;
    }
    // TODO: Implement getRecipient() method

    public K getRecipient() {
        return recipient;
    }
    // TODO: Implement getGift() method
    public V getGift() {
        return gift;
    }
    // TODO: Implement getEntry() method that returns:
    // "[recipient] -> [gift]"
    public String getEntry(){
        return recipient + " -> " + gift;
    }
}
