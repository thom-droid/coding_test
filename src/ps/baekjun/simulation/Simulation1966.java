package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Simulation1966 {

    private static LinkedList<int[]> roundingQueue;
    private static LinkedList<Integer> maxValueQueue;
    private static int count;
    private static int maxValue;

    private static void findOrder() {

        maxValueQueue.sort(Collections.reverseOrder());
        count = 0;

        while (roundingQueue.size() != 0) {
            orderQueue();
            int[] next = roundingQueue.poll();

            count++;

            if (next[1] == -1) {
                break;
            }
        }

    }

    private static void orderQueue() {

        maxValue = maxValueQueue.poll();

        int[] next = roundingQueue.peek();

        while (next[0] != maxValue) {

            if (next[0] < maxValue) {

                roundingQueue.poll();
                roundingQueue.add(next);

            }

            next = roundingQueue.peek();
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
            int targetPosition = Integer.parseInt(st.nextToken());
            String[] works = br.readLine().split(" ");

            int[][] arr = new int[workLength][2];

            for (int j = 0; j < arr.length; j++) {
                arr[j][0] = Integer.parseInt(works[j]);

                if (targetPosition == j) {
                    arr[targetPosition][1] = -1;
                }
            }

            roundingQueue = Arrays.stream(arr).collect(Collectors.toCollection(LinkedList::new));

            maxValueQueue = Arrays.stream(works)
                    .map(Integer::parseInt)
                    .collect(Collectors.toCollection(LinkedList::new));

            findOrder();

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
