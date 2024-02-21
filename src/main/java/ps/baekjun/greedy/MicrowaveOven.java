package ps.baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MicrowaveOven {

    static final int TIMER_A = 300;
    static final int TIMER_B = 60;
    static final int TIMER_C = 10;

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count_300 = 0;
        int count_60 = 0;
        int count_10 = 0;

        if(t >= 300){
            count_300 = t / TIMER_A;
            t -= count_300 * TIMER_A;
        }

        if(t >= 60){
            count_60 = t / TIMER_B;
            t -= count_60 * TIMER_B;
        }

        if(t >= 10){
            count_10 = t / TIMER_C;
            t -= count_10 * TIMER_C;
        }

        if(t >= 1 && t < 10){
            System.out.println(-1);
        } else {
            System.out.println(count_300+" "+count_60+" "+count_10);
        }


    }
}
