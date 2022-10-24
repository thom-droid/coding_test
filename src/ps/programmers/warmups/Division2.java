package ps.programmers.warmups;

public class Division2 {

    public static void main(String[] args) {
        System.out.println(divide(3, 2));
        System.out.println(divide(7, 3));
        System.out.println(divide(1, 16));
    }

    public static int divide(int num1, int num2) {
        return (int)(((double) num1 / num2) * 1000);
    }
}
