package SimpleQue;

import java.util.Scanner;

public class SwapBitwiseoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter !st numb");
        int  a = sc.nextInt();
        System.out.println("enter 2nd numb");
        int b = sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
