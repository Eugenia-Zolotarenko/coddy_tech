import java.util.HashMap;
import java.util.TreeMap;

public class MainWordCounter {

    public static void main(String[] args) {

        String text = "Coddy!";
        printWords(text);
                // printWords("Coddy");
                // Write your code here
    }
    public static void printWords(String text){
        TreeMap<String, Integer> countWords = new TreeMap<>();
        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];
        int total = 0, unic = 0, max = 1, least= 0;

        for (int i = 0; i<textArray.length;i++){
            textArray[i] = sentences[i].strip().split(" ");
        }


//            for (int i = 0; i<textArray.length;i++){
//                for (int j=0; j<textArray[i].length; j++){
//                   // System.out.println("Word[" + i +"," + j+ "]: " + textArray[i][j]);
//
//                    System.out.printf("Word[%d,%d]: %s\n", i,j, textArray[i][j]);
//                }
//            }

        for (int i =0; i<textArray.length; i++){
            for (int j = 0; j<textArray[i].length; j++){
                //System.out.printf("Original[%d,%d]: %s\n", i,j, textArray[i][j]);
                textArray[i][j]= textArray[i][j].replaceAll("[^a-zA-Z ]", "").toLowerCase();
                countWords.put(textArray[i][j],
                        countWords.getOrDefault(textArray[i][j], 0) + 1);
                        // System.out.printf("Processed[%d,%d]: %s%n", i, j, textArray[i][j]);
            }
        }


//            for (String[] strings : textArray) {
//                for (String string : strings) {
//                    countWords.put(string, countWords.getOrDefault(string, 0) + 1);
//                }
//            }
//            for (String word: countWords.keySet()){
//                System.out.println(word+ ": " + countWords.get(word));
//            }

        for (Integer count: countWords.values()){
            total +=count;
        }

        for (String word: countWords.keySet()){
            if(countWords.get(word) > max){
                max = countWords.get(word);
            }
        }
        System.out.println("Total words: " + total);
        System.out.println("Unique words: " + countWords.size());
        System.out.println("Word statistics: ");

        for (String word: countWords.keySet()){
            double percent = (double) countWords.get(word)/ total *100;
            int c = countWords.get(word);
            System.out.printf("%s: %d (%.2f%%)\n", word, c,percent);
        }

    }

}

