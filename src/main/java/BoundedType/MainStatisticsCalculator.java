package BoundedType;

public class MainStatisticsCalculator {
    public static void main(String[] args) {
                // Read inputs
        int int1 = 5;
        int int2 = 3;
        double double1 = 2.5;
        double double2 = 1.5;

        // TODO: Create a NumberStats<Integer> with the two integer values
        // Print the sum and average in the format:
        // Integer sum: [sum]
        // Integer average: [average]
        NumberStats<Integer> intStats = new NumberStats<>(int1, int2);
        System.out.println("Integer sum: " + intStats.getSum());
        System.out.println("Integer average: " + intStats.getAverage());


        // TODO: Create a NumberStats<Double> with the two double values
        // Print the sum and average in the format:
        // Double sum: [sum]
        // Double average: [average]
        NumberStats<Double> dStats = new NumberStats<>(double1, double2);
        System.out.println("Double sum: " + dStats.getSum());
        System.out.println("Double average: " + dStats.getAverage());
        // TODO: Create a ComparableBox<Integer> with the two integer values
        // Print the max and max as double in the format:
        // Max integer: [max]
        // Max as double: [maxAsDouble]
        ComparableBox<Integer> comparableBox = new ComparableBox<>(int1, int2);
        System.out.println("Max integer: " + comparableBox.getMax());
        System.out.println("Max as double: " + comparableBox.getMaxAsDouble());
    }
}
