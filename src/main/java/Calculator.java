public class Calculator {
    // TODO: Create private fields:
    // - name (String)
    // - memory (double)
    // - operationCount (int)
    private  String name;
    private  double memory;
    private int operationCount;

    // TODO: Create a constructor with name parameter
    // Set name, memory = 0, operationCount = 0
    // Use 'this' keyword

    public Calculator(String name) {
        this.name = name;
        this.memory = 0;
        this.operationCount = 0;
    }

    public Calculator(){
        this("Default");
    }


    // TODO: Create a default constructor
    // Chain to the other constructor with name = "Default"

    // TODO: Create getters: getName(), getMemory(), getOperationCount()

    public String getName() {
        return name;
    }

    public int getOperationCount() {
        return operationCount;
    }

    public double getMemory() {
        return memory;
    }

    // TODO: Create add(double a, double b) - returns sum
    // Store result in memory, increment operationCount

    public double add(double a, double b){
        double sum=a+b;
        this.memory = sum;
        this.operationCount++;
        return sum;
    }

    // TODO: Create subtract(double a, double b) - returns difference
    // Increment operationCount
    public double subtract(double a, double b){
        this.operationCount++;
        return a-b;
    }

    // TODO: Create multiply(double a, double b) - returns product
    // Increment operationCount
    public double multiply(double a, double b){
        this.operationCount++;
        return a*b;
    }

    // TODO: Create divide(double a, double b) - returns quotient
    // Return 0 if b is 0, increment operationCount
    public double divide(double a, double b){
        this.operationCount++;
        if(b==0) return 0;
            return a/b;
    }

    // TODO: Create power(double base, double exponent) - returns base^exponent
    // Use Math.pow(), increment operationCount
    public double power(double base, double exponent){
        this.operationCount++;
        return Math.pow(base, exponent);
    }
}