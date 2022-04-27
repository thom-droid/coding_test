package ps.baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WaitingAtATM {

    public static void main(String[] args) throws IOException {
        //가장 짧은 순으로 정렬해서 합을 계산하면 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int people = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] time = new int[people];
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < time.length; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);
        System.out.println(Arrays.toString(time));

        for(int i = 0; i < time.length; i++){

            for(int j = 0; j <= i; j++){
                sum += time[j];
            }

        }

        System.out.println(sum);
    }
}
