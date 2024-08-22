package SimpleQue;
import java.util.Scanner;

public class AverageNnumbers {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Initialize the array to store 5 integer values
            int[] values = new int[5];

            // Read the 5 integer values
            System.out.println("Enter 5 integer values:");
            for (int i = 0; i < 5; i++) {
                values[i] = scanner.nextInt();
            }

            // Read the two limits
            System.out.print("Enter the first limit (limit1): ");
            int limit1 = scanner.nextInt();

            System.out.print("Enter the second limit (limit2): ");
            int limit2 = scanner.nextInt();

            // Check if limit1 is less than limit2
            if (limit1 >= limit2) {
                System.out.println("Invalid limits: limit1 should be less than limit2.");
                scanner.close();
                return;
            }

            // Variables to store the sum and count of valid numbers
            int sum = 0;
            int count = 0;

            // Calculate the sum of values greater than limit1 and less than limit2
            for (int value : values) {
                if (value > limit1 && value < limit2) {
                    sum += value;
                    count++;
                }
            }

            // Calculate and print the average as an integer
            if (count > 0) {
                int average = sum / count;  // Integer division
                System.out.println("The average of values between " + limit1 + " and " + limit2 + " is: " + average);
            } else {
                System.out.println("No values found between " + limit1 + " and " + limit2 + ".");
            }

            // Close the scanner
            scanner.close();
        }


}
