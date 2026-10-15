import java.util.Arrays;

public class InterviewCodingChallengesPackI {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(mergeSort(new int[]{5, 6, 34}, new int[]{1, 4, 6, 34, 123})));
        System.out.println(Arrays.toString(
                mergeSort(new int[]{1, 4, 6, 8, 14, 23}, new int[]{2, 3, 5, 7, 11, 18, 19, 20})));

        System.out.println("Is almost palindrome: " + isAlmostPalindrome("racebar"));
        System.out.println("max: " + secondMost(new int[]{ 4,5, 5, 4, 3, 5, 1}));
        System.out.println("max: " + secondMost(new int[]{72, 93, 72,  98, 83, 98, 72, 98, 44, 25, 53, 43, 98, 81}));
        System.out.println("max: " + secondMost(new int[]{1, 1, 2, 2, 1, 3}));


    }

    public static int[] mergeSort(int[] a1, int[] a2) {
        // Write code here
        int[] a3 = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                a3[k++] = a1[i++];
            } else {
                a3[k++] = a2[j++];
            }
        }
        while (i < a1.length) {
            a3[k++] = a1[i++];
        }
        while (j < a2.length) {
            a3[k++] = a2[j++];
        }

        return a3;
    }

    public static boolean isAlmostPalindrome(String s) {
        // Write code here
        if (s == null) return false;
        int count = 0;
        String[] letters = s.replace(" ", "").split("");
        for (int i = 0, j = letters.length - 1; i < j; i++, j--) {
            if (letters[i].equalsIgnoreCase(letters[j])) continue;
            else count++;
            if (count >= 2) return false;
        }

        return true;
    }

    public static int secondMost(int[] a) {
        // Write code here
        int max1;
        int[] count = new int[a.length];
        int countMax = 0;
        int countSecondMax = 0;
        int max2 = a[0];

        for (int i = 0; i < a.length; i++) {
            max1 = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    max1++;
                }
            }
            count[i]= max1;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i] > countMax) {
                countMax = count[i];
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == countMax) continue;
            if(count[i] > countSecondMax) {
                countSecondMax = count[i];
                max2 = a[i];
            }
        }
        return max2;
    }
}
