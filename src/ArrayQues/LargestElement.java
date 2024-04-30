package ArrayQues;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr1[] = {2,4 ,5,6};
        int max = arr1[0];
        for(int i=0;i< arr1.length;i++){
            if(max<arr1[i]){
                max = arr1[i];
            }
        }
        System.out.println(max);
    }
}
