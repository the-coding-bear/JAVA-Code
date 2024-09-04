package ArrayQues;

public class AverageArray {
    public static void main(String[] args) {
        int arr[] = {1,6,3,4,5,6};
        int n = arr.length;
        double sum =0;
        for (int i = 0;i<n;i++){
            sum+=(double)arr[i];
        }
        double average = sum/ n ;
        System.out.println("The average is :" + average);
    }
}
