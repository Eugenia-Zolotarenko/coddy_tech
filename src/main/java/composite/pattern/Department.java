package composite.pattern;

import java.util.ArrayList;
import java.util.List;

// Composite class that can hold both employees and sub-departments
// Implements OrganizationComponent interface

class Department implements OrganizationComponent {
    // TODO: Declare private field for name (String)
    private String name;

    // TODO: Declare private List<OrganizationComponent> to hold children
    List<OrganizationComponent> components = new ArrayList<>();

    // TODO: Create constructor that takes name as parameter
    // Initialize the children list
    public Department(String name) {
        this.name = name;
    }

    // TODO: Implement add method to add OrganizationComponent to children
    public void add(OrganizationComponent component){
        components.add(component);
    }
    // TODO: Implement showDetails method
    // Should print: [indent][name] Department
    // Then call showDetails on each child with indent + "  " (two spaces)
    @Override
    public void showDetails(String indent) {
        System.out.println(indent+name+ " Department");
        for (OrganizationComponent component: components){
            component.showDetails(indent + "  ");
        }
    }

    // TODO: Implement getSalary method
    // Should return the sum of all children's salaries
    @Override
    public int getSalary() {
        int sum = 0;
        for (OrganizationComponent component: components){
            sum+=component.getSalary();
        }
        return sum;
    }
}
