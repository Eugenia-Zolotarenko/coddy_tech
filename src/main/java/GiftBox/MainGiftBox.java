package GiftBox;

public class MainGiftBox {
    public static void main(String[] args) {
         // Read inputs
        String recipientName = "Alice";
        String giftDescription = "Teddy Bear";
        int giftValue = 25;

        // TODO: Create a GiftBox<String> containing the gift description
        // TODO: Wrap it using the wrap() method
        // TODO: Print its status using getStatus()
        GiftBox<String> description = new GiftBox<>(giftDescription);
        description.wrap();
        System.out.println(description.getStatus());

        // TODO: Create a GiftBox<Integer> containing the gift value
        // TODO: Don't wrap this one - print its status (should show unwrapped)
        GiftBox<Integer> value = new GiftBox<>(giftValue);
        System.out.println(value.getStatus());

        // TODO: Create a Registry<String, String> pairing recipient with gift description
        // TODO: Print the registry entry using getEntry()
        Registry<String, String> registry = new Registry<>(recipientName, description.getItem());
        System.out.println(registry.getEntry());
    }
}
