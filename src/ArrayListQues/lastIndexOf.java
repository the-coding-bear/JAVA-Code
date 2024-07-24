package ArrayListQues;

import java.util.ArrayList;

public class lastIndexOf {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(4);
        list.add(9);

        int result= list.lastIndexOf(4);
        System.out.println(result);
        result=list.lastIndexOf(7);
        System.out.println(result);
    }
}
