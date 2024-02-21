package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

//Silver1
public class Simulation1946 {

    private static int N, T;
    private static int applicants;
    private static int[][] scores;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            applicants = T = Integer.parseInt(br.readLine());
            scores = new int[T][2];

            for (int j = 0; j < T; j++) {

                st = new StringTokenizer(br.readLine());
                scores[j][0] = Integer.parseInt(st.nextToken());
                scores[j][1] = Integer.parseInt(st.nextToken());

            }

            solve();
            sb.append(applicants).append('\n');

        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

    }

    private static void solve() {

        // 서류 순위 오름차순 정렬
        Arrays.sort(scores, Comparator.comparingInt(o -> o[0]));

        // 서류 1위의 면접 순위
        int interviewRank = scores[0][1];

        // 서류 1위 합격자의 면접 순위보다 낮으면 탈락, 높으면 합격
        for (int i = 1; i < T; i++) {

            if (interviewRank < scores[i][1]) {
                applicants--;
            } else {
                interviewRank = scores[i][1];
            }
        }

    }

}
