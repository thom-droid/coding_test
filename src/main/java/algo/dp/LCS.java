package algo.dp;

public class LCS {
    static String x = "ABCBDAB";
    static String y = "BDCABA";

    public static void main(String[] args) {
        System.out.println(lcsLength(x,y));
    }

    public static int lcsLength(String x, String y){
        StringBuffer s = new StringBuffer();
        int m = x.length();
        int n = y.length();

        int[][] c = new int[m+1][n+1];

        for(int i = 0; i <= m; i++){
            c[i][0] = 0;
        }

        for(int i = 0; i <= n; i++){
            c[0][i] = 0;
        }

        for(int i = 1; i <= m; i++){

            for(int j = 1; j <= n; j++){

                if(x.charAt(i-1) == y.charAt(j-1)){
                    c[i][j] = c[i-1][j-1] + 1;
                } else {
                    c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
                }
            }
        }

        return c[m][n];
    }
}
