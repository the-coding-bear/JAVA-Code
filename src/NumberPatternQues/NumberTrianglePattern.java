package NumberPatternQues;

import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = read.nextInt();
        int num=1;
        for (int i=1;i<=n;i++){
            for (int j=2;j>=i-1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(num);
                System.out.print(" ");
            }
            num++;
            System.out.println();
        }
    }
}
