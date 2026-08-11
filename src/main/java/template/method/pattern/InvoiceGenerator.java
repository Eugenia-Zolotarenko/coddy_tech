package template.method.pattern;

// Concrete subclass for generating invoices
class InvoiceGenerator extends DocumentGenerator {

    // TODO: Add private fields to store customer name and amount
    private String customerName;
    private double amount;
    // TODO: Create a constructor that takes customer name (String) and amount (double)

    public InvoiceGenerator(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }
    // TODO: Implement createHeader() to print: *** INVOICE ***
    @Override
    void createHeader() {
        System.out.println("*** INVOICE ***");
    }
    // TODO: Implement createBody() to print:
    // Customer: [name]
    // Amount Due: $[amount] (format amount to two decimal places)
    // Hint: Use String.format("%.2f", amount) for formatting
    @Override
    void createBody() {
        System.out.println("Customer: " + customerName);
        System.out.printf("Amount Due: $%.2f\n", + amount);
    }

    // TODO: Override createFooter() to print: Thank you for your business!
    @Override
    void createFooter() {
        System.out.println("Thank you for your business!");
    }
}
