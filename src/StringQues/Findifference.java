package StringQues;

public class Findifference {
    long findDiff(long amount) {
        // Convert the amount to a string for easy manipulation
        String amountStr = String.valueOf(amount);

        // Replace all '6's with '9's to get the maximum possible amount
        String maxAmountStr = amountStr.replace('6', '9');

        // Convert back to long to perform subtraction
        long maxAmount = Long.parseLong(maxAmountStr);

        // Calculate the extra amount
        long extraAmount = maxAmount - amount;

        return extraAmount;
    }

    public static void main(String[] args) {
        Findifference solution = new Findifference();

        long amount = 296;  // example amount
        long extraAmount = solution.findDiff(amount);

        System.out.println("Maximum extra amount Pappu might give: " + extraAmount);
    }
}
