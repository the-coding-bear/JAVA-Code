package SimpleQue;
import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        System.out.print("Enter two numbers :");
    int x = read.nextInt();
    int y = read.nextInt();
    int res=gcd(x,y);
        System.out.println("The GCD of two numbers is "+ res);
    }
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}