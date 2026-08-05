package Counter;

class Counter {
    // TODO: Create a private static variable to track total instances
    private static int total;

    // TODO: Create a private instance variable 'id' for unique identifier
    private int id;

    // TODO: Create a constructor that:
    // - Increments the total count
    // - Assigns the current count as this instance's id

    public Counter() {
        total++;
        this.id = total;
    }

    // TODO: Create a method getId() that returns this counter's unique id

    public int getId() {
        return this.id;
    }

    // TODO: Create a static method getTotalCount() that returns total Counter objects created
    public static int getTotalCount(){
        return total;
    }
}
