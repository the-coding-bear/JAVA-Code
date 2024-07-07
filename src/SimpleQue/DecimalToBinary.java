package SimpleQue;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 13;
        String binary = decimalToBinary(decimal);
        System.out.println("Binary equivalent of decimal number " + decimal + " is: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            
            decimal = decimal / 2;
        }
        return binary;
    }
}
