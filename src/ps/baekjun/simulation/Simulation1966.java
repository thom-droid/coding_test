package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Simulation1966 {

    private static LinkedList<int[]> roundingQueue;
    private static LinkedList<Integer> linkedList;
    private static int count;
    private static int maxValue;
    private static int target;

    private static void findOrder() {

        linkedList.sort(Collections.reverseOrder());

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
        boolean isOrdered = false;
        boolean hasFound = false;

        maxValue = linkedList.poll();

        while (!isOrdered) {

            int[] next = roundingQueue.peek();

            if (next[0] < maxValue) {

                if (target == next[0] && !hasFound) {
                    hasFound = true;
                    next[1] = -1;
                }

                roundingQueue.poll();
                roundingQueue.add(next);

            } else {
                isOrdered = true;
            }



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
            target = Integer.parseInt(works[targetPosition]);

            roundingQueue = Arrays.stream(works)
                    .map(Integer::parseInt)
                    .map(integer -> {
                        int[] arr = new int[2];
                        arr[0] = integer;
                        return arr;}).collect(Collectors.toCollection(LinkedList::new));

            linkedList = Arrays.stream(works)
                    .map(Integer::parseInt)
                    .collect(Collectors.toCollection(LinkedList::new));

            findOrder();

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
