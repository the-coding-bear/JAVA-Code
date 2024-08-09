package ArrayQues;

public class CountPairXor {
    long evenCount = 0;
    long oddCount = 0;

    long countXorPair(long[] arr, int n) {
        // Traverse the array to count even and odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Number of pairs with odd XOR is the product of evenCount and oddCount
        return evenCount * oddCount;
    }

    // Main method to test the Solution class
    public static void main(String[] args) {
        // Example array
        long[] arr = {1, 2, 3, 4, 5};
        int n = arr.length; // Get the number of elements in the array

        // Create an instance of Solution class
        CountPairXor solution = new CountPairXor();

        // Call the countXorPair method and store the result
        long result = solution.countXorPair(arr, n);

        // Print the result
        System.out.println("Number of pairs with odd XOR: " + result);
    }
}


