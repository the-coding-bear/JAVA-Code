package SimpleQue;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();
        boolean result = isPalindrome(input);
        if (result){
            System.out.println("The number is a palindrome ");
        }else {
            System.out.println("The number is not a palindrome ");
        }
    }
    public static boolean isPalindrome(int n){

        if (n<0){
            return false;
        }

        int originalnumb = n;
        int reversednum = 0;
        while (n!=0){
            int digit = n%10;
            reversednum = reversednum*10 + digit;
            n/=10;
        }
        return originalnumb == reversednum;
    }
}
