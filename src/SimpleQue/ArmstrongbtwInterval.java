package SimpleQue;

import java.util.Scanner;

public class ArmstrongbtwInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number");
        int start = sc.nextInt();
        System.out.print("Enter ending number");
        int end = sc.nextInt();
        boolean result = printArmstrongNumbers(start,end);
        System.out.print(result);
    }
    public static boolean printArmstrongNumbers(int start, int end){
        for (int i=start;i<=end;i++){
            int sum =0;
            int temp = i;
            int digits = (int) Math.log10(i) + 1;
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int)Math.pow(digit, digits);
                temp /= 10;
            }

            // if the sum is equal to the current number, print it
            if (sum == i) {
                System.out.println(i);
            }
        }

        return true;
    }
}
