package StringQues;

public class RemoveSpace {
    public static String Removespaces(String S){
        return S.replace(" ","");
    }

    public static void main(String[] args) {
        String str = "i love my family";
        System.out.println(Removespaces(str));
    }
}
