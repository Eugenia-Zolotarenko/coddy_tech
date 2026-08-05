package StringUtils;

public class MainStringUtils {
    public static void main(String[] args) {
        String text = "a";
        System.out.println("Vowels: " +  StringUtils.countVowels(text));
        System.out.println("Reversed: " +  StringUtils.reverse(text));
        System.out.println("Palindrome: " +  StringUtils.isPalindrome(text));
        System.out.println("*******************************\n");

        text = "hello";
        System.out.println("Vowels: " +  StringUtils.countVowels(text));
        System.out.println("Reversed: " +  StringUtils.reverse(text));
        System.out.println("Palindrome: " +  StringUtils.isPalindrome(text));

        System.out.println("*******************************\n");

        text = "Racecar";
        System.out.println("Vowels: " +  StringUtils.countVowels(text));
        System.out.println("Reversed: " +  StringUtils.reverse(text));
        System.out.println("Palindrome: " +  StringUtils.isPalindrome(text));

        System.out.println("*******************************\n");

        text = "A man a plan a canal Panama";
        System.out.println("Vowels: " +  StringUtils.countVowels(text));
        System.out.println("Reversed: " +  StringUtils.reverse(text));
        System.out.println("Palindrome: " +  StringUtils.isPalindrome(text));
        System.out.println("*******************************\n");

        text = "xyz";
        System.out.println("Vowels: " +  StringUtils.countVowels(text));
        System.out.println("Reversed: " +  StringUtils.reverse(text));
        System.out.println("Palindrome: " +  StringUtils.isPalindrome(text));

        System.out.println("*******************************\n");

        text = "AEIOU";
        System.out.println("Vowels: " +  StringUtils.countVowels(text));
        System.out.println("Reversed: " +  StringUtils.reverse(text));
        System.out.println("Palindrome: " +  StringUtils.isPalindrome(text));

        System.out.println("*******************************\n");

        text = "12345";
        System.out.println("Vowels: " +  StringUtils.countVowels(text));
        System.out.println("Reversed: " +  StringUtils.reverse(text));
        System.out.println("Palindrome: " +  StringUtils.isPalindrome(text));
        System.out.println("*******************************\n");

        text = "12345";
        System.out.println("Vowels: " +  StringUtils.countVowels(text));
        System.out.println("Reversed: " +  StringUtils.reverse(text));
        System.out.println("Palindrome: " +  StringUtils.isPalindrome(text));
    }
}
