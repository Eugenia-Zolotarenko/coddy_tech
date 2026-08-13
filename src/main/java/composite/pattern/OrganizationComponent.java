package composite.pattern;

// Define the component interface for the Composite Pattern
// This interface will be implemented by both Employee (leaf) and Department (composite)

interface OrganizationComponent {
    // TODO: Declare the showDetails method that takes a String indent parameter
    void showDetails(String indent);

    // TODO: Declare the getSalary method that returns an int
    int getSalary();
}
