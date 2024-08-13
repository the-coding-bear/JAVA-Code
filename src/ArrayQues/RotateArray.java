package ArrayQues;

public class RotateArray {
    // Function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array to the right by k positions
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than n

        if (k == 0) return; // No need to rotate if k is 0

        // Reverse the whole array
        reverse(arr, 0, n - 1);

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the rest of the array
        reverse(arr, k, n - 1);
    }

    // Utility method to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array:");
        printArray(arr);

        rotate(arr, k);

        System.out.println("Array after rotation by " + k + " positions:");
        printArray(arr);
    }
}
