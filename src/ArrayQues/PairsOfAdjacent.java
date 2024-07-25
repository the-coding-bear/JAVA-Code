package ArrayQues;

import java.util.Scanner;

public class PairsOfAdjacent {
    public static int PairOfAdj(int N,int[] array){
        int count =0;
        for (int i=0;i<N-1;i++){
            if (array[i+1]-array[i]==1){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(PairOfAdj(n,arr));
    }
}
