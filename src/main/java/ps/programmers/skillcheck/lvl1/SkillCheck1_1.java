package ps.programmers.skillcheck.lvl1;

import java.util.Arrays;

public class SkillCheck1_1 {

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int[] d2 = {2,2,3,3};
        System.out.println(solution(d, 9));
        System.out.println(solution(d2, 10));
    }

    public static int solution(int[] d, int budget){
        Arrays.sort(d);
        int count = 0;
        for(int i = 0; i < d.length; i++){
            if(budget < d[i]){
                return count;
            }
            budget -= d[i];
            count++;
        }
        return count;
    }
}
