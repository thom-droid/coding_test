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
            sb.append(T).append('\n');

        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

    }

    private static void solve() {

        // 서류 순위 내림차순 정렬
        Arrays.sort(scores, (o1, o2) -> o2[0] - o1[0]);

        // 면접 순위 정렬 값을 저장
        LinkedList < Integer > queue = Arrays.stream(scores).map(scores -> scores[1]).collect(Collectors.toCollection(LinkedList::new));

        // 면접 순위 중 최고 순위 출력 위한 큐
        PriorityQueue<Integer> priorityQueue = Arrays.stream(scores).map(scores -> scores[1]).collect(Collectors.toCollection(PriorityQueue::new));

        while (queue.size() > 1) {

            // 면접 순위 추출
            int nextPoint = queue.poll();

            // 해당 순위는 비교 대상이 되면 안되므로 우선순위 큐에서도 제거
            priorityQueue.remove(nextPoint);

            // 현재 큐 내의 최고 순위를 추출
            int lowestPoint = priorityQueue.peek();

            // 비교하여 면접 순위보다 높은 순위가 있는 경우 탈락
            if(nextPoint > lowestPoint) {
                T--;
            }
        }

    }

}
