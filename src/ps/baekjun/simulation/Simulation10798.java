package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// bronze 1
public class Simulation10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] strings = new String[5];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            strings[i] = str;
        }

        int maxLength = Arrays.stream(strings).mapToInt(String::length).max().getAsInt();

        for (int i = 0; i < maxLength; i++) {

            for (int j = 0; j < 5; j++) {
                if (strings[j].length() <= i) {
                    continue;
                }
                sb.append(strings[j].charAt(i));
            }
        }

        System.out.println(sb);
    }
}
