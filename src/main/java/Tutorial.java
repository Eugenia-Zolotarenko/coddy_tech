import java.util.Arrays;
import java.util.Scanner;

public class Tutorial {


    public static void main(String[] args) {

        int[][] matr = {{1,2,3}, {4,5,6}, {7,8,9}};
        arrayOperations(matr);

        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        printPatterns(matrix);


        array3D(2,6,9);


        createJaggedArray(5);


        char ch = '\0';
        System.out.println("char: " + ch);

        String numS1 = "2147483647";
        String numS2 = "1";
        int res1 = Integer.parseInt(numS1) + Integer.parseInt(numS2);

        System.out.println("num1: " + res1);


        String strNull = "\n";
        System.out.println(strNull);

        String[] arStr1 = {"1", "2", "3", "4", "5", "6", "7"};
        String[] arStr2 = {"3", "4", "5"};
        // Write your code below

        String s1 = String.join("", arStr1);
        String s2 = String.join("", arStr2);
        System.out.println(s1);


        System.out.println(s1.contains(s2));
        //if(s1.contains(s2))


        int n = 7;
        for (int i = 1; i <= n; i++) {
            //String srt5 = new String(new char[i]).replace("\0", "*");
            //srt5 = srt5.replace("\0", "*");
            System.out.println(new String(new char[i]).replace("\0", "*"));
        }

        String str3 = "helloo   ";
        String str4 = "hello";
        boolean res;

        res = str3.equals(str4);
        System.out.printf("%s equals %s: %b\n", str3, str4, res);

        res = str3.equalsIgnoreCase(str4);
        System.out.printf("%s equalsIgnoreCase %s: %b\n", str3, str4, res);

        int resTo;
        resTo = str3.compareTo(str4);
        System.out.printf("%s compareTo %s: %d\n", str3, str4, resTo);

        resTo = str3.compareToIgnoreCase(str4);
        System.out.printf("%s compareToIgnoreCase %s: %d\n", str3, str4, resTo);


        String productName = "laptop";
        int quantity = 3;
        double unitPrice = 1299.9999;

        String str = String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f",
                productName, (double) quantity, unitPrice);

        System.out.println(str);

        int num1 = 234;
        long num2 = 1234567890987654L;

        String str1 = Integer.toString(num1);
        String str2 = String.valueOf(num2);

        System.out.println(str1.length());
        System.out.println(str2.length());

        int[] arr = {1, 2, 3, 4, 5};
        char[] charr = {'1', '7', '2', '9'};
        String[] sarr = {"1", "4", "2"};
        String[] sarr1 = {"Hello!", "course", "AI-Web Development", "QA"};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(charr));
        merge(sarr, sarr1);

        System.out.println(prod(arr));

        System.out.println(Arrays.toString(reverse(arr)));

        transform(sarr1);

        analyzeString("They speak English in the United States.");


//        Scanner scanner = new Scanner(System.in); // Don't change this line
//        System.out.print("Input any number: ");
//        int n1 = scanner.nextInt(); // Don't change this line
//        System.out.print("Input any number: ");
//        int n2 = scanner.nextInt(); // Don't change this line
//        System.out.print("Input any operator: ");
//        scanner.nextLine(); // Don't change this line
//        String op = scanner.nextLine(); // Don't change this line

        // Write your code below
        /*double result = switch (op) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "/" -> n1 / n2;
            case "*" -> n1 * n2;
            default -> 0;
        };

         */
//        double result= 0;
//
//        if (op.equals("+"))
//            result = n1 + n2;
//        else if (op.equals("-"))
//            result = n1 - n2;
//        else if (op.equals("/"))
//            result = n1 / n2;
//        else if (op.equals("*"))
//            result = n1 * n2;
//        System.out.println(result);
    }

    public static void merge(String[] arr1, String[] arr2) {
        // Write code here
        int finalLength = arr1.length + arr2.length;
        String[] finalArray = new String[finalLength];
        System.arraycopy(arr1, 0, finalArray, 0, arr1.length);
        System.arraycopy(arr2, 0, finalArray, arr1.length, arr2.length);
        System.out.println(Arrays.toString(finalArray));
        Arrays.sort(finalArray);
        System.out.println(Arrays.toString(finalArray));

        //return null;
    }

    public static int prod(int[] arr) {
        // Write your code below
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static int[] reverse(int[] arr) {
        // Write your code below
        int[] dest = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dest[arr.length - 1 - i] = arr[i];
        }
        return dest;

    }

    public static void transform(String[] arr) {
        // Write code here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5)
                count++;
        }

        String[] dest = new String[count];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                dest[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(dest));
        //return null;
    }

    public static void analyzeString(String str) {
        // Write your code here
        System.out.println("Length: " + str.length());
        System.out.println("Char at 4: " + str.charAt(4));
        System.out.println("Substring: " + str.substring(7));
        System.out.println("Substring 2: " + str.substring(3, 6));
        System.out.println("Ends with dot: " + str.endsWith("."));
        System.out.println("Uppercase: " + str.toUpperCase());

    }

    public static void createJaggedArray(int n) {
        // Write your code here
        int[][] jaggedArr = new int[n][];

        for (int i = 0; i < n; i++) {
            jaggedArr[i] = new int[i + 1];
        }

        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                jaggedArr[i][j] = (i + 1) * (j + 1);

            }
            System.out.println(Arrays.toString(jaggedArr[i]));
        }

    }

    public static void array3D(int depth, int rows, int cols) {
        int[][][] array3D = new int[depth][rows][cols];
        // Write your code below

        for (int i = 0; i<array3D.length;i++){
            for (int j=0; j<array3D[i].length; j++){
                for (int k=0; k<array3D[i][j].length; k++){
                    array3D[i][j][k] = (i+1)*(j+1)*(k+1);
                }
            }
        }

        // Print the 3D array
        for (int d = 0; d < depth; d++) {
            System.out.println("Depth " + d + ":");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    System.out.print(array3D[d][r][c] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void printPatterns(int[][] matrix) {
        // Write your code here
        System.out.print("Main Diagonal: ");
        for (int i = 0; i<matrix.length; i++){
            System.out.print(matrix[i][i]+ " ");
        }
        System.out.println();

        System.out.print("Anti-Diagonal: ");
        for (int i = 0; i<matrix.length; i++){
            System.out.print(matrix[i][matrix.length-1-i]+ " ");
        }
        System.out.println();

        System.out.print("Top Border: ");
        for (int i = 0; i<matrix.length; i++){
            System.out.print(matrix[0][i]+ " ");
        }
        System.out.println();

        System.out.print("Bottom Border: ");
        for (int i = 0; i<matrix.length; i++){
            System.out.print(matrix[matrix.length-1][i]+ " ");
        }
        System.out.println();

        System.out.print("Left Border: ");
        for (int i = 0; i<matrix.length; i++){
            System.out.print(matrix[i][0]+ " ");
        }
        System.out.println();

        System.out.print("Right Border: ");
        for (int i = 0; i<matrix.length; i++){
            System.out.print(matrix[i][matrix.length-1]+ " ");
        }
        System.out.println();
    }

    public static void arrayOperations(int[][] matrix) {
        // Write your code here
        int[] rowSums = new int[matrix.length];
        int sum = 0;
        int max = matrix[0][0];
        for (int i = 0; i<matrix.length;i++){
            int rowSum = 0;
            for (int j = 0; j<matrix[0].length; j++){
                sum += matrix[i][j];
                if (matrix[i][j]>max) max = matrix[i][j];
                rowSum += matrix[i][j];
            }
            rowSums[i]=rowSum;
        }


        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Row Sums: " + Arrays.toString(rowSums));

    }
}




    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wind = scanner.nextInt(); // Don't change this line
        String status;
        // Type your code below
        if (wind<8) {
            status = "Calm";
        } else if (wind <= 31) {
            status = "Breeze";
        } else if (wind <= 63) {
            status = "Gale";
        } else status = "Storm";


        // Don't change the line below
        System.out.println("status = " + status);
        scanner.close(); // Closing the scanner after use
    }
}

/*import java.util.Scanner;

public class JavaScanner {
    public static void main (String[] args) {

        System.out.print("Input any decimal number: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        System.out.println ("You've inputted " + number);

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.next();
        System.out.println(phrase1);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input any 2 words or phrases: ");
        String phrase1 = sc.nextLine();
        String phrase2 = sc.nextLine();
        System.out.println(phrase1 + " " + phrase2);

         */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input any word or phrase: ");
        String phrase1 = sc.nextLine();
        System.out.println(phrase1);
         */

       /*Scanner k = new Scanner(System.in);
        System.out.println ("Input 2 any integers: ");
        int number1 = k.nextInt();//считывает первое число и присваивает значение в number1
        int number2 = k.nextInt();//считывает второе число и присваивает значение в number2
        System.out.print(number1 + number2);//выводит сумму number1 + number2

        */



        /*System.out.print("Input any number from 1 to 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("You typed " + number);

         */
  //  }
//}


