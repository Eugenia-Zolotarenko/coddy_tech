package composite.pattern;
// Leaf class representing individual workers
// Implements OrganizationComponent interface

class Employee implements OrganizationComponent {
    // TODO: Declare private fields for name (String) and salary (int)
    private String name;
    private int salary;

    // TODO: Create constructor that takes name and salary as parameters
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    // TODO: Implement showDetails method
    // Should print: [indent][name]: $[salary]
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + name+": $" + salary);
    }
    // TODO: Implement getSalary method
    // Should return the employee's salary
    @Override
    public int getSalary() {
        return salary;
    }
}

