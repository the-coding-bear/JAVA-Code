package ArrayQues;

import java.util.Scanner;

public class FindElementIndex {
    public static int findElementAtIndex(int key,int[] arr){
        int result=0;
         for(int i=0;i< arr.length;i++){
             if(i==key){
                 result = arr[i];
             }
         }return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key");
        int k= sc.nextInt();
        System.out.print("Enter the number of elements");
        int n= sc.nextInt();
        int[] arr = new int[n] ;
        System.out.print("Enter the elements of array");

        for (int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.print(findElementAtIndex(k,arr));
    }
}
