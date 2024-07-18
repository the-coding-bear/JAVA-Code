package StringQues;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String str = "Hello, world!";
        char c = 'o';
        int frequency = findFrequency(str, c);
        System.out.println("The frequency of '" + c + "' in the string '" + str + "' is: " + frequency);
    }

    public static int findFrequency(String str, char c) {
        int count = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == c) {
                count++;
            }
            i++;
        }
        return count;
    }
}
