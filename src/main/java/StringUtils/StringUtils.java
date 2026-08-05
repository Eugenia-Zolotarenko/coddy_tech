package StringUtils;

class StringUtils {

    // TODO: Create a static method countVowels that takes a String
    // and returns the count of vowels (a, e, i, o, u - case insensitive)
    public static int countVowels(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)=='a' || text.charAt(i)=='e'
            ||text.charAt(i)=='i' || text.charAt(i)=='o'
            ||text.charAt(i)=='u'||text.charAt(i)=='A'
            ||text.charAt(i)=='E'||text.charAt(i)=='I'
            ||text.charAt(i)=='U'||text.charAt(i)=='O')
                count++;
        }
        return count;
    }

    /*

     public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
     */

    public static String reverse(String text){
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }

    public static boolean isPalindrome(String text){
        text = text.strip();
        text.replaceAll("^[a-zA-Z]", "");
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        String reversed = sb.toString();
        return text.equalsIgnoreCase(reversed);
    }


    // TODO: Create a static method reverse that takes a String
    // and returns the reversed version of it


    // TODO: Create a static method isPalindrome that takes a String
    // and returns true if it reads the same forwards and backwards
    // (case-insensitive comparison)||

}
