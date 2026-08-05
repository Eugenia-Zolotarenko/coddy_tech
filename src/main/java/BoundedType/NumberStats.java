package BoundedType;

class NumberStats<T extends Number> {
    // TODO: Declare two private fields of type T: value1 and value2
    private T value1;
    private T value2;
    // TODO: Create a constructor that accepts both values

    public NumberStats(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    // TODO: Implement getSum() method
    // Returns the sum of both values as a double
    // Hint: Use the doubleValue() method from Number class
    public double getSum(){
        return  value1.doubleValue() + value2.doubleValue();
    }
    // TODO: Implement getAverage() method
    // Returns the average of the two values as a double
    public double getAverage(){
        return getSum()/2;
    }
}