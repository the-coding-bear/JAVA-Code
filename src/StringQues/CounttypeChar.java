package StringQues;

import java.util.Arrays;
import java.util.Scanner;

public class CounttypeChar {
    int[] count (String s)
    {
        // your code here
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                c1++;
            }else if(ch>='a'&& ch<='z'){
                c2++;
            }else if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                c4++;
            }else{
                c3++;
            }
        }
        return new int[]{c1, c2, c4, c3};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] S= new CounttypeChar().count(str);
        System.out.println(Arrays.toString(S));
    }
}
