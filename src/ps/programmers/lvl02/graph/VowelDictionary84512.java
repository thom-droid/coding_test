package ps.programmers.lvl02.graph;

public class VowelDictionary84512 {

    private int count = 0;
    final String[] vowels = {"A", "E", "I", "O", "U"};

    public int solution(String word) {

        int answer = 0;

        String[][] matrix = new String[5][5];
        boolean[][] visited = new boolean[5][5];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = "A";
            matrix[i][1] = "E";
            matrix[i][2] = "I";
            matrix[i][3] = "O";
            matrix[i][4] = "U";
        }

        search(word, 0, 1, matrix, visited, new StringBuilder());

        return count;

    }

    private void search(String word, int level, int count, String[][] matrix, boolean[][] visited, StringBuilder sb) {

        if (word.equals(sb.toString())) {
            this.count = count;
            return ;
        }

        if (level == matrix.length) {
            return ;
        }

        for (int i = 0; i < matrix.length; i++) {

            if (!visited[level][i]) {
                visited[level][i] = true;
                sb.append(matrix[level][i]);
                search(word, level + 1, count + 1, matrix, visited, sb);
                sb.deleteCharAt(sb.length() - 1);
                visited[level][i] = false;
            }
        }

    }

    public int solution2(String word) {

        for (String vowel : vowels) {
            if (dfs(vowel, word)) {
                return count;
            }
        }

        return count;
    }

    private boolean dfs(String part, String origin) {

        count++;

        if (part.equals(origin)) {
            return true;
        }

        if (part.length() == 5) {
            return false;
        }

        for (String vowel : vowels) {
            if(dfs(part + vowel, origin))
                return true;
        }

        return false;
        
    }
}
