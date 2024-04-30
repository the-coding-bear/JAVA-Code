package ArrayQues;

import java.util.Arrays;
import java.util.Scanner;

public class smallestElement {
    public static void main(String[] args) {
        int i,smallelement=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter "+ num+ " numbers:");
        for ( i =0;i<num;i++)
            arr[i] = sc.nextInt();

            smallelement = arr[0];
            for (i=1;i<num;i++){
                if (smallelement>arr[i])
                    smallelement = arr[i];
            }

        System.out.println("Smallest element:" + smallelement);

    }
}
