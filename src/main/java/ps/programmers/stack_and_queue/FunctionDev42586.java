package ps.programmers.stack_and_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/* progresses are works need to be dealt,
speeds are about how much of work is done each day
must return int array that includes how many works can be deployed at a time
* */
public class FunctionDev42586 {

    // each day, the speed is added to the progress
    // and we need to examine if the first node of queue is done ( >= 100)
    // and then also check how many other nodes behind the first are done
    // poll all the possible nodes and count them, store that number somewhere

    private static final int COMPLETED = 100;

    public static int[] solution(int[] progresses, int[] speeds) {

        // queue is needed as any work must not be deployed before the prior work is deployed
        LinkedList<Integer> workQueue = Arrays.stream(progresses).boxed().collect(Collectors.toCollection(LinkedList::new));

        // and a queue for speeds as well since its order correspond to the progress
        LinkedList<Integer> speedQueue = Arrays.stream(speeds).boxed().collect(Collectors.toCollection(LinkedList::new));

        ArrayList<Integer> countingList = new ArrayList<>();

        while (workQueue.size() > 0) {

            // if only one work is left, then add 1 then break the loop
            if (workQueue.size() == 1) {
                countingList.add(1);
                break;
            }

            int count = 0;

            // add the speed to each progress
            // we need to loop the whole list to add speed, but linked list may not be good for linear loop like this.
            for (int i = 0; i < workQueue.size(); i++) {
                workQueue.set(i, workQueue.get(i) + speedQueue.get(i));
            }

            boolean isConsecutive = true;

            // need to check if next nodes are also ready to be polled
            while (isConsecutive) {

                // during the loop, if queue becomes empty, store the counted value
                // and then break, and start from the beginning
                if (workQueue.size() == 0) {
                    countingList.add(count);
                    break;
                }

                // see if the first node is completed
                int work = workQueue.peek();

                // if yes, then poll the first node, and corresponding speed as well
                // then increase the count by 1
                if (work >= COMPLETED) {
                    workQueue.poll();
                    speedQueue.poll();
                    count++;
                    continue;
                }

                // if no, then stop the loop, and add the counted value
                // if count is zero, which means the first node is not ready
                if (count != 0) {
                    countingList.add(count);
                }

                isConsecutive = false;

            }

        }

        return countingList.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}
