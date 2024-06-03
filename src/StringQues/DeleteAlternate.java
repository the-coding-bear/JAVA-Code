package StringQues;

import java.util.Scanner;

public class DeleteAlternate {
    static String delAlternate(String S){
        String str ="";
        for(int i=0;i<S.length();i+=2){
            str = str + S.charAt(i);

        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        delAlternate(str);
        System.out.println(delAlternate(str));
    }
}
