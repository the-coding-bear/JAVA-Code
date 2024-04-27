package SimpleQue;

import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number = ");
        int num = sc.nextInt();
        int sum=0;
      //  System.out.println(num*(num+1)/2 );
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
