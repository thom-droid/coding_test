package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Simulation1966 {

    private static LinkedList<Integer> roundingQueue;
    private static int count;
    private static int maxValue;
    private static int target;

    private static void findOrder() {




    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int workLength = Integer.parseInt(st.nextToken());
            int targetPosition = Integer.parseInt(st.nextToken());

            String[] works = br.readLine().split(" ");
            target = Integer.parseInt(works[targetPosition]);
            maxValue = Arrays.stream(works).mapToInt(Integer::parseInt).max().getAsInt();
            roundingQueue = Arrays.stream(works)
                    .map(Integer::parseInt)
                    .collect(Collectors.toCollection(LinkedList::new));

            findOrder();

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
