package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MinMaxFromLottery {
    public static void main(String[] args) {

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }

    public static int[] solution(int[] lottos, int[] win_nums){

        Set<Integer> set;
        int min;
        int max;

        // 0 개수
        int k = (int) Arrays.stream(lottos).filter(v -> v==0).count();

        set = Arrays.stream(win_nums).boxed().collect(Collectors.toSet());
        Set<Integer> set1 = Arrays.stream(lottos).filter(v   -> v != 0).boxed().collect(Collectors.toSet());


        int l = set.size();
        set.addAll(set1);

        // 일치하는 수
        int m = l + set1.size();
        int n = m - set.size();

        min = 7 - n;

        if(min == 7){
            min = 6;
        }

        max = 7 - (n+k);

        if(max ==7){
            max = 6;
        }

        return new int[]{max, min};
    }
}
