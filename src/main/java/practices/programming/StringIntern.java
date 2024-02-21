package practices.programming;

public class StringIntern {

    public static void main(String[] args) {
        String str = "String";
        String newString = new String("String");
        System.out.println(str == newString);
        String internedString = newString.intern();
        System.out.println(str == internedString);
    }
    private static void testIfTwoStringsAreTheSame() {
        String str = new String("no1");

    }
}
