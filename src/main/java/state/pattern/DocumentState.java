package state.pattern;

// Define the DocumentState interface
// This interface declares the methods that all states must implement

interface DocumentState {
    // TODO: Declare the edit method that takes a Document parameter
    void edit(Document doc);

    // TODO: Declare the approve method that takes a Document parameter
    void approve(Document doc);
}
