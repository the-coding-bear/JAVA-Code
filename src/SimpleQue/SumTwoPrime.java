package SimpleQue;

import java.util.Scanner;

public class SumTwoPrime {
    public static void main(String[] args){
        // Scanner class for taking input
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();

        boolean isFound = false;

        // loop to iterate over the given input
        for (int i = 2; i <= n / 2; i++) {
            // if the boolean variable is true
            if (isPrime(i)) {
                int diff = n - i;

                if (isPrime(diff)) {
                    System.out.println(n + " can be expressed as the sum of " + i + " and " + diff);
                    isFound = true;
                }
            }
        }

        // if the boolean variable is false
        if (!isFound) {
            System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
        }
    }

    // function to check whether a number is prime or not
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
