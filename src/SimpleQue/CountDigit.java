package SimpleQue;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        long num = sc.nextLong();
        int count=0;
        while (num!=0)
        {
            num/=10;
            count++;
        }
        System.out.println("Number of Digits = " + count);
    }
}
