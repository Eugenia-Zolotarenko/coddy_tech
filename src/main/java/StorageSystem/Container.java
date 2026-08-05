package StorageSystem;

import java.util.ArrayList;
import java.util.List;

class Container<T> {
    // TODO: Create an ArrayList<T> to store elements internally
    ArrayList<T> elements = new ArrayList<>();

    // TODO: Implement add(T item) method to add an element
    public void add(T item){
        elements.add(item);
    }

    // TODO: Implement get(int index) method to retrieve an element at a specific position
    public T get(int index){
        return elements.get(index);
    }

    // TODO: Implement size() method to return the count of items
    public int size(){
        return elements.size();
    }

    // TODO: Implement isEmpty() method to check if the container has no elements
    public boolean isEmpty(){
        return elements.isEmpty();
    }

    // TODO: Implement getAll() method that returns the internal list
    public List<T> getAll(){
        return elements;
    }

}
