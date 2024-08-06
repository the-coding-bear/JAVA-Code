package SimpleQue;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        float height = sc.nextFloat();

        float Bmi= (weight/(height*height));
        if (Bmi<18){
            System.out.println(0);
        } else if (18>=Bmi && Bmi<25) {
            System.out.println(1);
        } else if (25>=Bmi && Bmi<30) {
            System.out.println(2);
        } else if (30>=Bmi && Bmi<40) {
            System.out.println(3);
        }
        else {
            System.out.println(4);
        }
    }
}
