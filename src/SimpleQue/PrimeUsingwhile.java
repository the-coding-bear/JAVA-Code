package SimpleQue;

import java.util.Scanner;

public class PrimeUsingwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        //Function calling for taking the answer
        boolean ans = isPrime(num);
        if (ans){
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It  is not a prime number");
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int i=2;
        while (i<=n/2){
            if (n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
