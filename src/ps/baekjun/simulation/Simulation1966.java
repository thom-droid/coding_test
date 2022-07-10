package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Simulation1966 {

    private static PriorityQueue<Integer> pq;
    private static int count;
    private static boolean hasFound;
    private static int currentOrder;

    private static void findOrder(int target) {

//        for (int work : works) {
//            pq.add(work);
//        }

        count = 0;
        hasFound = false;
        currentOrder = 1;

        while (pq.size() != 0) {
            if (hasFound && currentOrder - 1 != target) {
                break;
            }

            pq.poll();

            if (currentOrder - 1 == target) {
                hasFound = true;
            } else {
                currentOrder++;
            }

            count++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int workLength = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            pq = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toCollection(PriorityQueue::new));

            findOrder(target);

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
