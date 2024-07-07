package SimpleQue;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        String binary = sc.nextLine();
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal equivalent of binary number " + binary + " is: " + decimal);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLen = binary.length();
        for (int i = 0; i < binaryLen; i++) {
            int bit = binary.charAt(i) - '0';
            int power = binaryLen - i - 1;
            decimal += bit * (int)Math.pow(2, power);
        }
        return decimal;
    }
}
