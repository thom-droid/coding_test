package ps.programmers.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 체육복
public class Greedy42862 {

    public static void main(String[] args) {
//        System.out.println(solution(5, new int[]{2,4}, new int[]{1,3,5}));
//        System.out.println(solution(5, new int[]{2,4}, new int[]{3}));
//        System.out.println(solution(3, new int[]{3}, new int[]{1}));
//        System.out.println(solution(6, new int[]{1,3,4}, new int[]{3,5,8}));
        System.out.println(solution(6, new int[]{1,5,7}, new int[]{2,4,5,6}));
        System.out.println(solution(6, new int[]{1,5,7}, new int[]{6,5,4,2}));
        System.out.println(solution(6, new int[]{1, 3,4,6,7,8,9,10}, new int[]{2, 4, 5,6,10}));
    }

    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int[] people = new int[n];
            int answer = n;

            for (int l : lost)
                people[l-1]--;
            for (int r : reserve)
                people[r-1]++;

            for (int i = 0; i < people.length; i++) {
                if(people[i] == -1) {
                    if(i-1>=0 && people[i-1] == 1) {
                        people[i]++;
                        people[i-1]--;
                    }else if(i+1< people.length && people[i+1] == 1) {
                        people[i]++;
                        people[i+1]--;
                    }else
                        answer--;
                }
            }
            return answer;
        }
    }
    private static int solution(int n, int[] lost, int[] reserve) {

        LinkedList<Integer> reserveQueue = Arrays.stream(reserve).boxed().sorted().collect(Collectors.toCollection(LinkedList::new));
        LinkedList<Integer> lostQueue = Arrays.stream(lost).boxed().sorted().collect(Collectors.toCollection(LinkedList::new));
        ArrayList<Integer> redundant = new ArrayList<>();

        for (Integer integer :  reserveQueue) {
            if (lostQueue.contains(integer)) {
                redundant.add(integer);
            }
        }

        reserveQueue.removeAll(redundant);
        lostQueue.removeAll(redundant);

        while (reserveQueue.size() != 0) {

            Integer number = reserveQueue.poll();

            if (lostQueue.contains(number - 1) && lostQueue.contains(number + 1)) {
                lostQueue.poll();
            } else if (lostQueue.contains(number + 1)) {
                lostQueue.remove(Integer.valueOf(number + 1));
            } else {
                lostQueue.remove(Integer.valueOf(number - 1));
            }
        }

        return n - lostQueue.size();

    }

}
