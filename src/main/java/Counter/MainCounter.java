package Counter;

public class MainCounter {
    public static void main(String[] args) {

        int number = 0;
        int count = 0;

        // TODO: Use MathUtils static methods to calculate and print:
        // - Square: [value]
        // - Cube: [value]
        // - Circle area (radius=[number]): [value] (formatted to 2 decimal places)
        System.out.println("Square: " + MathUtils.square(number));
        System.out.println("Cube: " + MathUtils.cube(number));
        System.out.printf("Circle area (radius=%d): %.2f\n", number, MathUtils.circleArea(number));

        // TODO: Create 'count' number of Counter objects
        // For each Counter created, print: Counter [id] created
        for (int i = 1; i <=count ; i++) {
            Counter counter = new Counter();
            System.out.println("Counter "+i+" created");
        }

        // TODO: Print the total number of counters created
        // Total counters: [count]
        System.out.println("Total counters: " + Counter.getTotalCount());
    }
}
