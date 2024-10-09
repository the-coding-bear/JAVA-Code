package ArrayQues;

public class SmallOrLarge {
    public static void main(String[] args) {
        int[] arr = {12,34,45,56,78,9};
        int largest = arr[0],smallest = arr[0];
        for(int i = 0; i< 6; i++){
            if (smallest> arr[i])
              smallest = arr[i];
            if (largest<arr[i])
                largest = arr[i];
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
