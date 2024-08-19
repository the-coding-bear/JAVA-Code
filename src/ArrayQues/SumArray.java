package ArrayQues;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {3,5,56,78,100};
        int n = arr.length;
        int sum = 0;
        for (int i = 0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the element of the array is :" + sum);
    }
}
