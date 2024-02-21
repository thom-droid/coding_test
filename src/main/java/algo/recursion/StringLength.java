package algo.recursion;

public class StringLength {

    public static void main(String[] args) {
        String str = "abcd";
//        showString(str);
    }

    public static void showString(String str)   {
        if(str.length() == 0){
            return ;
        } else {
            showString(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }
}
