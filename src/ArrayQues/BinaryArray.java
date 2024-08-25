package ArrayQues;
import java.util.Arrays;
public class BinaryArray {


        public static void main(String[] args) {
            int[] A = {0, 1, 1, 0, 1, 0, 0, 1};  // Example binary array
            sortBinaryArray(A);
            System.out.println("Sorted array: " + Arrays.toString(A));
        }

        public static void sortBinaryArray(int[] A) {
            int countZero = 0;

            // Count the number of 0s in the array
            for (int value : A) {
                if (value == 0) {
                    countZero++;
                }
            }

            // Fill the array with 0s up to countZero
            for (int i = 0; i < countZero; i++) {
                A[i] = 0;
            }

            // Fill the remaining positions with 1s
            for (int i = countZero; i < A.length; i++) {
                A[i] = 1;
            }
        }


}
