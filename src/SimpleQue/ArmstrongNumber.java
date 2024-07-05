package SimpleQue;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = sc.nextInt();
        if(isArmstrong(number)){
            System.out.print(number + " is an armstrong number");
        }
        else{
            System.out.print(number + " is not an armstrong number");
        }
    }
    public static boolean isArmstrong(int num){
        int originalnum = num;
        int numOfDigits = String.valueOf(num).length();
        int sum = 0;
        while (num>0){
            int digit  = num%10;
            sum = sum + (int)Math.pow(digit,numOfDigits);
            num = num/10;
        }
        return originalnum==sum;
    }
}
