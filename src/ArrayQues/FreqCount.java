package ArrayQues;

public class FreqCount {
    public static void main(String[] args) {
        int arr[]= {10,5,10,15,5,10};
        int n = arr.length;
        countFrequency(arr,n);
    }
    public static void countFrequency(int arr[],int n){
        boolean visited[] = new boolean[n];
        for (int i = 0;i<n;i++){
            if (visited[i] == true)
                continue;

            //count frequency
            int count = 1;
            for (int j =i+1;j<n;j++){
                if (arr[i]== arr[j]){
                    visited[j]= true;
                    count++;
                }
            }
            System.out.println(arr[i] + "  "+ count);
        }
    }
}
