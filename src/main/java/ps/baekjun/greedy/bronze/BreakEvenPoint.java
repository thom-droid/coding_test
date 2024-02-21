package ps.baekjun.greedy.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int fc = Integer.parseInt(st.nextToken());
        int vc = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        int bep = 0;
        int margin = price - vc;

        if(margin <= 0){
            System.out.println(-1);

        } else {
            while((fc / margin) > bep){
                bep++;
            }

            System.out.println(bep+1);
        }



    }


}
