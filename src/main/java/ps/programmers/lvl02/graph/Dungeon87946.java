package ps.programmers.lvl02.graph;

public class Dungeon87946 {

    private int answer = 0;

    public int solution(int k, int[][] dungeons) {

        boolean[] visited = new boolean[dungeons.length];
        recursion(0, k, dungeons, visited);

        return answer;

    }

    private void recursion(int count, int hp, int[][] dungeons, boolean[] visited) {

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && hp >= dungeons[i][0]) {
                visited[i] = true;
                recursion(count + 1, hp - dungeons[i][1], dungeons, visited);
                visited[i] = false;
            }
        }

        answer = Math.max(answer, count);

    }


}
