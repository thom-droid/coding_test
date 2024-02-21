package ps.programmers.lvl02.stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class TruckPassingBridge42583 {

    public int solution4(int bridge_length, int weight, int[] truck_weights) {

        int count = 0;
        LinkedList<Integer> queue = Arrays.stream(truck_weights).boxed().collect(Collectors.toCollection(LinkedList::new));
        LinkedList<Integer> bridge = new LinkedList<>();

        for (int i = 0; i < bridge_length - 1; i++) {
            bridge.offer(0);
        }

        Integer init = queue.poll();
        bridge.offer(init);
        weight -= init;
        count++;

        while (!queue.isEmpty()) {

            Integer w = queue.peek();

            Integer arrived = bridge.poll();

            if (weight >= w) {

                weight += arrived;
                bridge.offer(queue.poll());
                weight -= w;

            } else {

                weight += arrived;
                Integer next = queue.peek();

                if (weight >= next) {
                    bridge.offer(queue.poll());
                    weight -= next;
                } else {
                    bridge.offer(0);
                }
            }

            count++;
        }

        while (!bridge.isEmpty()) {
            bridge.poll();
            count++;
        }

        return count;
    }


    // alternative
    class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 1;
        }

        public void moving() {
            move++;
        }
    }

    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for (int t : truckWeights) {
            waitQ.offer(new Truck(t));
        }

        int answer = 0;
        int curWeight = 0;

        while (!waitQ.isEmpty() || !moveQ.isEmpty()) {
            answer++;

            if (moveQ.isEmpty()) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
                continue;
            }

            for (Truck t : moveQ) {
                t.moving();
            }

            if (moveQ.peek().move > bridgeLength) {
                Truck t = moveQ.poll();
                curWeight -= t.weight;
            }

            if (!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
            }
        }

        return answer;
    }
}


