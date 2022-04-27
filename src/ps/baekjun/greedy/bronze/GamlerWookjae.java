package ps.baekjun.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GamlerWookjae {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int firstRound = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).map(operand -> operand = Math.abs(operand)).sum();
        int secondRound = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).map(operand -> operand = Math.abs(operand)).sum();

        System.out.println(firstRound + secondRound);


    }
}
