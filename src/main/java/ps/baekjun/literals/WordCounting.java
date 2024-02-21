package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordCounting {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if (s.equals(" ")){
            System.out.println(0);

        } else {

            long count = Arrays.stream(s.trim().split(" ")).count();

            System.out.println(count);
        }


    }
}
