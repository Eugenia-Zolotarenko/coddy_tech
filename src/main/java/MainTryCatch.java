public class MainTryCatch {
    public static void main(String[] args) {
        System.out.println(divideNumbers("5", "0", 0));
        divideNumbers("5", "0", 0);

    }

    public static String divideNumbers(String num1, String num2, int index) {
        // Write your code here
        double[] ar = new double[2];

        try {
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
        } catch (NumberFormatException e){
            return "Error: Invalid number format";
        }

        try {
            double res =  Integer.parseInt(num1) /Integer.parseInt(num2);
        } catch ( ArithmeticException e) {
            return "Error: Division by zero";
        }

        try {
            double res =  (double) Integer.parseInt(num1) /Integer.parseInt(num2);
            ar[index] = res;
            int re1 = (int) ar[index];
            return String.valueOf(re1);

        } catch (ArrayIndexOutOfBoundsException e) {
            return "Error: Invalid array index";
        }

    }
}
