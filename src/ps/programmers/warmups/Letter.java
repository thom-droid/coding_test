package ps.programmers.warmups;

public class Letter {

    public static void main(String[] args) {
        System.out.println(length("happy birthday!"));
    }

    public static int length(String msg) {
        return msg.length() * 2;
    }
}
