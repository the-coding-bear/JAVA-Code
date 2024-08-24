package StringQues;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    // Create a map to store Roman numeral values
    private static final Map<Character, Integer> romanToIntMap = new HashMap<>();

    static {
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
    }

    public static int romanToInt(String s) {
        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            // Get the value of the current Roman numeral
            int current = romanToIntMap.get(s.charAt(i));

            // If this is not the last character and the next character is larger, subtract this value
            if (i + 1 < length && romanToIntMap.get(s.charAt(i + 1)) > current) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV"; // Example: 1994
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of Roman numeral " + romanNumeral + " is " + result);
    }
}


