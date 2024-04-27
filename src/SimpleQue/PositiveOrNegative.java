package SimpleQue;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number =");
        num=sc.nextInt();
        //Condition to check if number is positive or negative
        if(num>0)
            System.out.println("The number is positive");
        else if (num<0)
            System.out.println("The number is negative");
        else
            System.out.println("Zero");
    }
}
