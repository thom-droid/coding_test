package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LessThanX10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int X = Integer.parseInt(input[1]);

        String a = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(x -> x < X)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(a);
    }
}
