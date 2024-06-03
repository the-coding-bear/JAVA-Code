package StringQues;

import java.util.Scanner;

public class RemoveSpace {
    public static String space(String S){
        return S.replace(" ","");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(space(str));
    }
}
