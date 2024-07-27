package ArrayQues;

public class NumberOfOccurences {
       int count(int[] arr,int n, int x){
           int count=0;
           for (int i=0;i<n;i++){
               if (arr[i]==x){
                   count++;
               }
           }return count;
       }

    public static void main(String[] args) {
        NumberOfOccurences obj = new NumberOfOccurences();
        int[] arr = {34, 12, 45, 12, 34, 12};
        int n = arr.length;
        int x = 12;
        System.out.println(obj.count(arr,n,x));
    }
}
