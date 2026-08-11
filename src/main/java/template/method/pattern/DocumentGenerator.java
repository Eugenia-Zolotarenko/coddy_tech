package template.method.pattern;

// Abstract base class that defines the template method
abstract class DocumentGenerator {

    // TODO: Create a final method called generateDocument() that defines the algorithm skeleton
    // It should call three steps in order: createHeader(), createBody(), createFooter()
    public final void generateDocument(){
        createHeader();
        createBody();
        createFooter();
    }

    // TODO: Declare abstract method createHeader()
    abstract void createHeader();

    // TODO: Declare abstract method createBody()
    abstract void createBody();

    // TODO: Create a hook method createFooter() with default implementation
    // Default should print: --- End of Document ---
    void createFooter(){
        System.out.println("--- End of Document ---");
    }

}
