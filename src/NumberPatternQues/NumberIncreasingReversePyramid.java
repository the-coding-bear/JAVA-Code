package NumberPatternQues;

import java.util.Scanner;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = read.nextInt();
        int num =1;
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                if(j==i){
                num=1;
            }
                System.out.print(num);
                System.out.print(" ");
                num++;
            }
            System.out.println();
        }
    }
}
