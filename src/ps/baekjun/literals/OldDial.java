package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OldDial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] time = {3,4,5,6,7,8,9,10}; // size 8

        int[][] dials = new int[26][2]; // [시간, 개수]의 이차원 배열

        String str = br.readLine();

        int sum = 0;
        int k = 0;

        for(int i = 0; i < time.length; i++){ // [시간, 개수]의 이차원 배열. 0번지부터 ABC라고 생각하면 됨


            if(i == 5 || i == 7){
                for(int j = 0; j < 4; j++){
                    dials[k][0] = time[i];
                    k++;
                }
                continue;
            }

            for(int j = 0; j < 3; j++){
                dials[k][0] = time[i];
                k++;
            }
        }

        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i) - 65;
            dials[index][1]++;
        }

        for(int i = 0; i < dials.length; i++){
            sum += dials[i][0] * dials[i][1];
        }

        System.out.println(sum);

    }
}
