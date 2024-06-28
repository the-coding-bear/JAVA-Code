package SimpleQue;

import java.util.Scanner;

public class ReverseNumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println("The reversed number is: " + reversedNumber);
    }
    public static int reverseNumber(int number) {
        int reversed = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;         // Get the last digit of the number
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
        }

        return reversed;
    }
}
