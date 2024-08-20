package ArrayQues;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr={3,4,67,42,3};
        int element=67;

        int[] newArray=remove(arr,element);
        System.out.println("OriginalArray= "+ Arrays.toString(arr));
        System.out.println("NewArray= "+Arrays.toString(newArray));
    }
    public static int[] remove(int[] array,int element){
        int[] newarray = new int[array.length-1];
        int index=0;
        for (int i=0;i< array.length;i++){
            if (array[i]!=element){
                newarray[index]=array[i];
                index++;
            }
        }
        return newarray;
    }
}
