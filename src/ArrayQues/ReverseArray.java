package ArrayQues;

public class ReverseArray {
    //Function to print array
    static void printArray(int arr[],int n){
        System.out.print("Reversed Array is : \n");
        for (int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    //funtion reverse array using recursion
    static void reverseArray(int arr[],int start,int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            reverseArray(arr,start+1,end-1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {5,4,3,2,1};
        reverseArray(arr,0,n-1);
        printArray(arr,n);
    }

}
