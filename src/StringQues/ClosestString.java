package StringQues;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestString {

    // Method to find the shortest distance between two words in a list
    public int shortestDistance(ArrayList<String> words, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int minDistance = Integer.MAX_VALUE;

        // Loop through the list of words
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word1)) {
                index1 = i;
            } else if (words.get(i).equals(word2)) {
                index2 = i;
            }

            // If both words have been found, calculate the distance
            if (index1 != -1 && index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        ClosestString closestString = new ClosestString();
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Acting","Practice", "makes", "coding", "makes","perfection"));
        String word1 = "coding";
        String word2 = "practice";

        int result = closestString.shortestDistance(words, word1, word2);
        System.out.println("Shortest distance: " + result);  // Output: 3
    }
}
