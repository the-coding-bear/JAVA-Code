package SimpleQue;

import java.util.Scanner;

public class FibonacciUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
    int n = sc.nextInt();
    int a = 0, b = 1;
    int c;
        System.out.print(a +" "+b);

    int i = 2;
        while(i<n)

    {
        c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
        i++;
    }
}
}
