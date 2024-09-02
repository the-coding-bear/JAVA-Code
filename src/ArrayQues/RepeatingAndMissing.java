package ArrayQues;

public class RepeatingAndMissing {
        int[] findTwoElement(int[] arr, int n) {
            // Step 1: Calculate expected sums
            long expectedSum = (long) n * (n + 1) / 2;
            long expectedSumOfSquares = (long) n * (n + 1) * (2 * n + 1) / 6;

            // Step 2: Calculate actual sums from the array
            long actualSum = 0;
            long actualSumOfSquares = 0;

            for (int num : arr) {
                actualSum += num;
                actualSumOfSquares += (long) num * num;
            }

            // Step 3: Compute differences
            long sumDiff = expectedSum - actualSum; // X - Y
            long sumOfSquaresDiff = expectedSumOfSquares - actualSumOfSquares; // X^2 - Y^2

            // Step 4: Use the differences to find X and Y
            // sumOfSquaresDiff = (X^2 - Y^2) = (X - Y) * (X + Y)
            // sumDiff = X - Y
            // Therefore, (X + Y) = sumOfSquaresDiff / sumDiff
            long sumPlusDiff = sumOfSquaresDiff / sumDiff;

            // Find the missing number (X) and the duplicate number (Y)
            long missingNumber = (sumDiff + sumPlusDiff) / 2;
            long duplicateNumber = missingNumber - sumDiff;

            // Return the result
            return new int[]{(int) duplicateNumber, (int) missingNumber};
        }

        public static void main(String[] args) {
            RepeatingAndMissing solve = new RepeatingAndMissing();

            // Test case: array with a missing number and a duplicate
            int[] arr = {1, 3, 2, 5, 3}; // Here, 4 is missing and 3 is duplicated
            int n = 5; // Size of the array

            int[] result = solve.findTwoElement(arr, n);

            System.out.println("Duplicate number: " + result[0]);
            System.out.println("Missing number: " + result[1]);
        }
    }


