package StringQues;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class FirstRepeatedCharacter {

        public static char findFirstRepeatedCharacter(String S) {
            Set<Character> seenChars = new HashSet<>();

            for (int i = 0; i < S.length(); i++) {
                char currentChar = S.charAt(i);
                if (seenChars.contains(currentChar)) {
                    return currentChar; // Found the first repeated character
                } else {
                    seenChars.add(currentChar);
                }
            }

            return '\0'; // No repeated character found
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String S = sc.next();
            char result = findFirstRepeatedCharacter(S);
            if (result != '\0') {
                System.out.println("The first repeated character is: " + result);
            } else {
                System.out.println("No repeated character found.");
            }
        }


}
