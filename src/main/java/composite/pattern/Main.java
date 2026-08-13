package composite.pattern;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        String emp1Name = "Alice";
        int emp1Salary = 75000;
        String emp2Name = "Bob";
        int emp2Salary = 65000;
        String subDeptName = "QA";
        String emp3Name = "Charlie";
        int emp3Salary = 55000;

        // TODO: Create the "Engineering" department as the root
        Department engineering = new Department("Engineering");

        // TODO: Create and add two employees to Engineering using emp1 and emp2 data
        OrganizationComponent emp1 = new Employee(emp1Name, emp1Salary);
        OrganizationComponent emp2 = new Employee(emp2Name, emp2Salary);
        engineering.add(emp1);
        engineering.add(emp2);

        // TODO: Create a sub-department using subDeptName
        Department subDepartment = new Department(subDeptName);

        // TODO: Create and add one employee to the sub-department using emp3 data
        OrganizationComponent emp3 = new Employee(emp3Name, emp3Salary);
        subDepartment.add(emp3);

        // TODO: Add the sub-department to Engineering
        engineering.add(subDepartment);

        // TODO: Call showDetails("") on the Engineering department
        engineering.showDetails("");

        // TODO: Print the total salary in format: Total Salary: $[amount]
        System.out.println("Total Salary: $"+ engineering.getSalary());
    }
}

