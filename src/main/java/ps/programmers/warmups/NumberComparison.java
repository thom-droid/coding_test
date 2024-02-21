package ps.programmers.warmups;

public class NumberComparison {

    public static void main(String[] args) {
        System.out.println(compare(5, 2));
        System.out.println(compare(1, 2));
        System.out.println(compare(2, 2));

    }

    public static int compare(int num1, int num2) {

        return Integer.compare(num1, num2);
    }
}
