package ArrayListQues;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDuplicate {
    public static ArrayList<Integer> duplicates(int[] arr) {
        int n = arr.length;
        // Initialize an ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();
        // Initialize a boolean array to track visited elements
        boolean[] visited = new boolean[n];

        // Sort the array to bring duplicates together
        Arrays.sort(arr);

        // Iterate through the sorted array
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] && !visited[i - 1]) {
                result.add(arr[i]);
                visited[i - 1] = true;
            }
        }

        // Handle edge case: no duplicates
        if (result.isEmpty()) {
            result.add(-2);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> duplicates = duplicates(arr);
        System.out.println(duplicates);  // Output: [2, 3]
    }
}
