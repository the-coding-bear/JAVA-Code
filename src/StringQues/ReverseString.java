package StringQues;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String  s = sc.next();
        String ans = isReverse(s);
        System.out.println(ans);
    }
    public static String isReverse(String str){
        if (str==null){
            return null;
        }
       StringBuilder stB = new StringBuilder(str);
        return stB.reverse().toString();
    }
}
