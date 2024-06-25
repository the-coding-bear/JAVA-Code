package SimpleQue;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter first number : \t");
        int a = read.nextInt();
        System.out.println("Enter second number : \t");
        int b= read.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println( "After swapping :" + a);
        System.out.println("After swapping :"+b);

    }
}
