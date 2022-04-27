package ps.programmers.lvl02;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Heap & BST
public class Scoville {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 9, 10, 12};
        int[] arr2 = {12,15,10,2,6,20};
        int[] arr3 = {2, 8, 100, 200, 120, 25, 47};
//        System.out.println(solution(arr, 7));
//        System.out.println(solution(arr2, 14));
        System.out.println(solution(arr3, 50));
    }

    public static int solution(int[] scoville, int K){

        PriorityBlockingQueue<Integer> queue = IntStream.of(scoville).boxed().collect(Collectors.toCollection(PriorityBlockingQueue::new));
        int count = 0;

        while(queue.size() > 1 && queue.peek() < K){
            int k = queue.poll() + queue.poll()*2;
            queue.add(k);
            count++;
        }

//        for(int i = 0; i < queue.size(); i++){
//            int peek = queue.peek();
//            if(peek < K){
//                queue.poll();
//                int f = queue.peek();
//                int k = peek+f*2;
//                queue.add(k);
//                queue.poll();
//                count++;
//            }
//        }


//        for(int k : queue){
//            sum += k;
//        }
//
//        if(sum < K){
//            return -1;
//        }

        return queue.peek() < K ? -1 : count;
    }
}
