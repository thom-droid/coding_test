package ps.programmers.lvl02;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// stack & queue
public class FunctionDev {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] test2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        int[] result2 = solution(test2, speeds2);
        System.out.println(Arrays.toString(result2));
//        int[] result = solution(progresses,speeds);
//        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] progresses, int[] speeds){
        BlockingQueue<Work> blockingQueue = new LinkedBlockingQueue<>();

        for(int i = 0; i < progresses.length; i++){
            blockingQueue.offer(new Work(progresses[i], speeds[i]));
        }

        System.out.println(Arrays.deepToString(blockingQueue.toArray()));

        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        while(!blockingQueue.isEmpty()){

            for(Work work: blockingQueue){
                work.progress += work.speed;
            }

            for(Work work: blockingQueue){
                assert blockingQueue.peek() != null;
                if(blockingQueue.peek().progress >= 100){
                    count++;
                    blockingQueue.poll();
                }
            }
            if(count > 0){
                list.add(count);
                count = 0;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static class Work{
        private int speed;
        private int progress;

        public Work(int progress, int speed){
            this.progress = progress;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "progress : "+ progress + " speed :" + speed;
        }
    }
}
