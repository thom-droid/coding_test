package ps.baekjun.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO10988 {
    public static void main(String[] args) throws IOException {

        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder sb = new StringBuilder(s);

        boolean palindrome = sb.reverse().toString().equals(s);
        System.out.println(palindrome ? 1 : 0);
    }
}
