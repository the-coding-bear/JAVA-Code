package StarPatternQues;

public class FullPyramid {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
