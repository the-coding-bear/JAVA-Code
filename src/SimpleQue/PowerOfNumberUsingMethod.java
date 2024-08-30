package SimpleQue;

import java.util.Scanner;

public class PowerOfNumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        double n =sc.nextDouble();
        System.out.print("Enter power of number");
        double m =sc.nextDouble();
        double result = Math.pow(n,m);
        System.out.println(result);
    }
}
