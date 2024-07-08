package SimpleQue;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Binary equivalent of decimal number " + decimal + " is: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return binary;
    }
}
