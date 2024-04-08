package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String s1 = bufferedReader.readLine();
        int index = Integer.parseInt(s1);
        System.out.println(s.charAt(index - 1));
    }
}