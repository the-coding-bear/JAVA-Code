package StringQues;

public class ValueOf {
    public static void main(String[] args) {
        int i = 100;
        long l = 1223344445555L;
        float f = 3.14f;
        double d = 1.234;
        boolean b = true;
        char c = 'A';
        Object obj = new Object();

        String str = String.valueOf(i);
        System.out.println(str);  // prints "100"

        str = String.valueOf(l);
        System.out.println(str);  // prints "1223344445555"

        str = String.valueOf(f);
        System.out.println(str);  // prints "3.14"

        str = String.valueOf(d);
        System.out.println(str);  // prints "1.234"

        str = String.valueOf(b);
        System.out.println(str);  // prints "true"

        str = String.valueOf(c);
        System.out.println(str);  // prints "A"

        str = String.valueOf(obj);
        System.out.println(str);  // prints "java.lang.Object@hashcode"
    }
}
