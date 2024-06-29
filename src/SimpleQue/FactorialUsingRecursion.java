package SimpleQue;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int result = isFactorial(n);
        System.out.println("The Factorial is "+result);
    }
    public static int isFactorial(int num){
        if (num==0){
            return 1;
        }
        else {
            return  num*isFactorial(num-1);
        }
    }
}
