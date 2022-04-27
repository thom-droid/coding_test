package ps.programmers.lvl01;

import java.util.Arrays;

public class RectangleCoordination {

    public static void main(String[] args) {

        int[][] arr = {{1,4},{3,4},{3,10}};
        int[][] arr2 = {{1,1},{2,2},{1,2}};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr2)));

    }

    public static int[] solution(int[][] v){


        int x;
        int y;

        x = v[0][0] == v[1][0] ? v[2][0] : v[1][0] == v[2][0] ? v[0][0] : v[1][0];

        y = v[0][1] == v[1][1] ? v[2][1] : v[1][1] == v[2][1] ? v[0][1] : v[1][1];

        return new int[]{x,y};
    }

}
