package ps.programmers.stack_and_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FunctionDev42586_Solved {

    public int[] solution(int[] progresses, int[] speeds) {
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
