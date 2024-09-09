package ArrayQues;

public class SecondLargest {
    static int SecSmallest(int arr[],int n){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            } else if (second>arr[i]) {
                second = arr[i];
            }
        }
        return second;

    }

    public static void main(String[] args) {
        int arr[] = {12,13,15,34,63};
        int n = arr.length;
        System.out.println(SecSmallest(arr,n));
    }
}
