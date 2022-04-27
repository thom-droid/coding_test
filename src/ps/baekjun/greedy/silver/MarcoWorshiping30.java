package ps.baekjun.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class MarcoWorshiping30 {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (!input.contains("0")) {
            System.out.println(-1);
        } else {

            Object[] sortedObjArr = Arrays.stream(input.split("")).sorted(Collections.reverseOrder()).toArray();

            StringBuffer sb = new StringBuffer();
            int sum = 0;

            for (int i = 0; i < sortedObjArr.length; i++) {
                sb.append(sortedObjArr[i]);
                sum += Integer.parseInt(String.valueOf(sortedObjArr[i]));
            }

            if (sum % 3 == 0) {

                System.out.println(sb);
            } else {
                System.out.println(-1);
            }
        }

    }

}
