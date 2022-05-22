package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//bronze 2
public class Literal2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char literal = str.charAt(i);
            sb.append(getCasedChar(literal));
        }

        System.out.println(sb);
    }

    private static char getCasedChar(char literal) {
        if (literal >= 97) {
            return literal -= 32;
        }

        return literal += 32;

    }

}
