package StringQues;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        

        System.out.println("Enter your string");
        String str = sc.nextLine();

        String newStr = str.replace('s', 'L');

        System.out.println("Original string: " + str);
        System.out.println("Replaced character: " + newStr);
    }
}
