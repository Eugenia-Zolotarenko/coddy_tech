package template.method.pattern;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        String reportTitle = "Q4 Sales";
        String customerName = "Acme Corp";
        double invoiceAmount = 1500.00;
        reportTitle = "Annual Report";
        customerName = "John Smith";
        invoiceAmount = 99.99;

        // TODO: Create a ReportGenerator with the title and call generateDocument()
        ReportGenerator reportGenerator = new ReportGenerator(reportTitle);
        reportGenerator.generateDocument();

        // TODO: Print an empty line for separation
        System.out.println();
        // TODO: Create an InvoiceGenerator with customer name and amount, and call generateDocument()
        InvoiceGenerator invoiceGenerator =
                new InvoiceGenerator(customerName, invoiceAmount);
        invoiceGenerator.generateDocument();

    }
}
