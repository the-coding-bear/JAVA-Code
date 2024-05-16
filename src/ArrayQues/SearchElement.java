package ArrayQues;

import java.util.*;
import java.lang.*;

public class SearchElement {

        public static void main (String[] args)
        {
            // your code goes here
            Scanner read = new Scanner(System.in);
            int N = read.nextInt();
            int X = read.nextInt();
            boolean found = false;
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = read.nextInt();
                if(X==arr[i]){
                    found=true;
                    break;
                }

            }
            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

}
