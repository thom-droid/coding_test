package ps.baekjun.IO;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String id = input.nextLine();

        StringBuffer sb = new StringBuffer(id);

        System.out.println(test(id));

    }

    public static String test(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.append("??!");
        return sb.toString();
    }
}
