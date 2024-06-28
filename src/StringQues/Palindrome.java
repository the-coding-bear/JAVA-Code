package StringQues;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        if (isPalindrome(str)){
            System.out.println("It is palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
    public static boolean isPalindrome(String s){
        int length = s.length();
        for (int i=1;i<length/2;i++){
            if (s.charAt(i)!=s.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
