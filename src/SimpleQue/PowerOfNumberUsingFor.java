package SimpleQue;

import java.util.Scanner;

public class PowerOfNumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int exponent = sc.nextInt();
        int base  = sc.nextInt();
        int result = 1;
        for (int i=1;i<=exponent;i++){
            result *=base;
        }
        System.out.println(result);
    }


}
