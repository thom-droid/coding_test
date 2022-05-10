package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OldDial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 각 다이얼 별로 걸리는 시간. 2는 3초, 3은 4초..
        // 그런데 할머니는 알파벳으로만 전화번호를 외우신다. 0에는 알파벳이 없으므로 제외
        int[] time = {3,4,5,6,7,8,9,10}; // size 8

        // [시간, 개수]의 이차원 배열.
        // 예를 들어 [{3, 1},{3, 2},{3,2}...] 에서
        // [t][n] 은 어떤 다이얼에 대응하는 알파벳 묶음의 자리(abc, def..)이고,
        // t는 그 다이얼을 눌렀을 때 필요한 시간이다.
        // n은 그 다이얼을 누른 횟수이다.
        int[][] dials = new int[26][2];

        String str = br.readLine();

        int sum = 0; // 총 걸릴 시간
        int k = 0; // 알파벳 인덱스

        for(int i = 0; i < time.length; i++){

            // 다이얼 별로(알파벳묶음) 걸리는 시간을 대입하는 작업.
            // abc, def로 3개씩 끊기지만
            // pqrs, wxyz 는 4개이므로 따로 분기처리를 함
            if(i == 5 || i == 7){
                for(int j = 0; j < 4; j++){
                    dials[k][0] = time[i];
                    k++;
                }
//                continue;
            }

            // 나머지 알파벳은 3개씩 끊어서 시간을 넣어준다
            for(int j = 0; j < 3; j++){
                dials[k][0] = time[i];
                k++;
            }
        }

        // 대문자만 입력될 것이기 때문에 대문자 A에 대응하는 65를 빼주면
        // 그 리터럴의 자리가 나온다. 52번 라인을 수행했을 때
        // 0이 나왔다는 의미는 dials배열에서 알파벳 A에 해당하므로 A를 하나 늘려준다.
        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i) - 65;
            dials[index][1]++;
        }

        // 이렇게 계산을 완료하고 각 알파벳별로 걸리는 시간을 곱해서 더해주면 된다.
        for(int i = 0; i < dials.length; i++){
            sum += dials[i][0] * dials[i][1];
        }

        System.out.println(sum);



    }
}
