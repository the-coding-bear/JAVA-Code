package StarPatternQues;

public class p7 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=2;j>=i-1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
