package StringQues;

public class StringLength {
    public static void main(String[] args) {
        String str = "PrepInsta!";

        // Get the length of the string
        int len = str.length();
        System.out.println("The length of the string is: " + len);  // The length of the string is: 13

        // Iterate through the characters of the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("Character at index " + i + ": " + c);
        }
    }
}
