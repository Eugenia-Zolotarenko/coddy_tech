package template.method.pattern;

// Concrete subclass for generating reports
class ReportGenerator extends DocumentGenerator {

    // TODO: Add a private field to store the report title
    private String reportTitle;

    // TODO: Create a constructor that takes a report title (String)

    public ReportGenerator(String reportTitle) {
        this.reportTitle = reportTitle;
    }
    // TODO: Implement createHeader() to print: === REPORT: [title] ===
    @Override
    void createHeader() {
        System.out.printf("=== REPORT: %s ===\n", reportTitle);
    }
    // TODO: Implement createBody() to print: Report content goes here...
    @Override
    void createBody() {
        System.out.println("Report content goes here...");
    }

    // Note: Use the inherited default footer (no need to override createFooter)

}
