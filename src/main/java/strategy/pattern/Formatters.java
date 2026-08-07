package strategy.pattern;

// TODO: Implement three concrete formatter classes that implement TextFormatter

import java.util.Arrays;

// UpperCaseFormatter - transforms text to all uppercase
class UpperCaseFormatter implements TextFormatter {
    // TODO: Implement the format method
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}

// LowerCaseFormatter - transforms text to all lowercase
class LowerCaseFormatter implements TextFormatter {
    // TODO: Implement the format method
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}

// TitleCaseFormatter - capitalizes first letter of each word, rest lowercase
class TitleCaseFormatter implements TextFormatter {
    // TODO: Implement the format method
    // Hint: Words are separated by spaces
    @Override
    public String format(String text) {
        String[] words = text.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[i].substring(0, 1).toUpperCase() +
                    words[i].substring(1).toLowerCase();
        }

        return String.join(" ", result);
    }


//        class TitleCaseFormatter implements TextFormatter {
//            public String format(String text) {
//                if (text == null || text.isEmpty()) {
//                    return text;
//                }
//
//                String[] words = text.split(" ");
//                StringBuilder result = new StringBuilder();
//
//                for (int i = 0; i < words.length; i++) {
//                    if (words[i].length() > 0) {
//                        String word = words[i].toLowerCase();
//                        result.append(Character.toUpperCase(word.charAt(0)));
//                        if (word.length() > 1) {
//                            result.append(word.substring(1));
//                        }
//                    }
//                    if (i < words.length - 1) {
//                        result.append(" ");
//                    }
//                }
//
//                return result.toString();
//            }




}