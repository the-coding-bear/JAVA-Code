package SimpleQue;

import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();
        int result = 1;
        for (int i=1;i<=input;i++){
            result *=i;
        }
        System.out.println("Factorial is " + result);
    }
}
