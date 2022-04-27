package ps.programmers.skillcheck.lvl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkillCheck1_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        solution(a,b);
    }

    public static void solution(int a, int b){

        for(int i = 0; i < b; i++){

            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
