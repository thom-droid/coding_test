package ps.programmers.lvl02.graph;

import java.util.LinkedList;

public class TargetNumber43165 {

    private boolean[][] visited;
    private int[][] matrix;
    private int loop;

    private int answer = 0;
    private int count = 0;

    public int solution(int[] numbers, int target) {

        visited = new boolean[numbers.length][2];
        matrix = new int[numbers.length][2];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = numbers[i];
            matrix[i][1] = -1 * numbers[i];
        }

        loop = numbers.length;
        int number = 0;
        dfs(number, target, 0);

        return answer;
    }

    private void dfs(int number, int target, int itr) {
        if (itr == loop) {
            if (number == target) {
                answer++;
            }
            return ;
        }


        for (int j = 0; j < matrix[0].length; j++) {

            if (!visited[itr][0] && !visited[itr][1]) {
                visited[itr][j] = true;
                int cur = matrix[itr][j];
                number += cur;
                dfs(number, target, itr + 1);
                number -= cur;
                visited[itr][j] = false;
            }
        }

    }

    public int solution2(int[] numbers, int target) {
        dfs(0, numbers, target, 0);

        return count;
    }

    private void dfs(int index, int[] numbers, int target, int cur) {
        if (index == numbers.length) {
            if (target == cur) {
                count++;
            }

            return ;
        }

        dfs(index + 1, numbers, target, cur + numbers[index]);
        dfs(index + 1, numbers, target, cur - numbers[index]);
    }


}
