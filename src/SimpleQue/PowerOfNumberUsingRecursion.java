package SimpleQue;

import java.util.Scanner;

public class PowerOfNumberUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base");
        int base  = sc.nextInt();
        System.out.println("Enter exponent");
        int exponent = sc.nextInt();
        System.out.println(power(base,exponent));
    }
    public static int power(int base,int exponent){
        if (exponent==0){
            return 1;
        }
        else {
            return base* power(base,exponent-1);
        }
    }
}
