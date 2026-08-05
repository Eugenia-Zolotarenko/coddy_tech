package BoundedType;

class ComparableBox<T extends Number & Comparable<T>> {
    // TODO: Declare two private fields of type T: first and second
    private T first;
    private T second;
    // TODO: Create a constructor that accepts both values

    public ComparableBox(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // TODO: Implement getMax() method
    // Returns the larger value using compareTo()
    public T getMax(){
        return first.compareTo(second) >0 ? first: second ;
    }

    // TODO: Implement getMaxAsDouble() method
    // Returns the larger value converted to a double
    public double getMaxAsDouble(){
        return first.compareTo(second) >0 ? first.doubleValue(): second.doubleValue() ;
    }
}
