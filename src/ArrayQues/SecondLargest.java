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
        int[] arr = {122,13,145,34,63};
        int n = 5;
        System.out.println(SecSmallest(arr,n));
    }
}
