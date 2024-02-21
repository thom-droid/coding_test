package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// bronze 4, 1712
public class BreakEvenPoint {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int fixedCost = input[0];
        int variableCost = input[1];
        int price = input[2];

        int margin = price - variableCost;
        int breakEvenPoint = 0;

        if (variableCost >= price) {
            System.out.println(-1);
        } else {

            while(fixedCost >= margin * breakEvenPoint){
                breakEvenPoint++;
            }

            System.out.println(breakEvenPoint);
        }

    }

}
