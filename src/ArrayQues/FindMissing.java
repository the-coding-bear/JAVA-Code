package ArrayQues;

public class FindMissing {
    public long findMissing(long a[], long b[], int n) {
        // Calculate the sum of elements in array 'a'
        long sumA = 0;
        for (int i = 0; i < n; i++) {
            sumA += a[i];
        }

        // Calculate the sum of elements in array 'b'
        long sumB = 0;
        for (int i = 0; i < n - 1; i++) {
            sumB += b[i];
        }

        // The missing element is the difference between sumA and sumB
        long missingElement = sumA - sumB;

        return missingElement;
    }

    public static void main(String[] args) {
        FindMissing sol = new FindMissing();

        long[] a = {1, 2, 3, 4, 5};
        long[] b = {3, 5, 4, 1};
        int n = a.length;

        System.out.println("The missing element is: " + sol.findMissing(a, b, n));  // Output should be 2
    }
}
