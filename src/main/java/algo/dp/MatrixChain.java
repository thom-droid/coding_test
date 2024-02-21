package algo.dp;

// 곱셈이 성립하는 행렬 A1*A2*A3... An 까지의 최소 곱셈 연산 횟수를 구하는 알고리즘

public class MatrixChain {
    static int[] p = { 2, 3, 3, 4, 4, 2, 2, 4, 4, 5, 5, 6, 6, 7, 7, 3};
    static int[][] m = new int[9][9];

    public static void main(String[] args) {
        System.out.println(matrixChain(3));
    }

    public static int matrixChain(int n){

        for(int i = 1; i <= n; i++){
            m[i][i] = 0;
        }

        for(int r = 1; r <= n - 1; r++){

            for(int i = 1; i <= n - r; i++){

                int j = i + r;
                m[i][j] = m[i+1][j] + p[i-1]*p[i]*p[j];

                for(int k = 1; k <= j - 1; k++){
                    m[i][j] = Math.min(m[i][j], (m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j]));
                }
            }
        }

        return m[1][n];
    }
}
