package algo.dp;

public class Binomial {

    public static void main(String[] args) {
        long start1 = System.nanoTime();
        int n = 20;
        int k = 10;
        System.out.println(binom(n, k));
        long end1 = System.nanoTime();

        System.out.println("algo.dp time: " + (end1 - start1));

        long start2 =System.nanoTime();
        System.out.println(binomRecursion(n, k));
        long end2 = System.nanoTime();

        System.out.println("algo.recursion time: " + (end2 - start2));

        long start3 =System.nanoTime();
        System.out.println(memoization(n, k));
        long end3 = System.nanoTime();

        System.out.println("memoization time: " + (end3 - start3));
    }

    public static int binom(int n, int k){
        int[][] binom = new int[100][100];

        for(int i = 0; i <= n; i++){

            for(int j = 0; j <= i && j <= k; j++){

                if( i == j || j == 0){
                    binom[i][j] = 1;

                } else {
                    binom[i][j] = binom[i-1][j-1] + binom[i-1][j];

                }
            }
        }
//        System.out.println(Arrays.deepToString(binom));
        return binom[n][k];
    }

    public static int binomRecursion(int n, int k){

        if(n == k || k == 0){
            return 1;
        } else {

            return binomRecursion(n-1, k - 1) + binomRecursion(n-1, k);

        }


    }


    public static int memoization(int n, int k){
        int[][] binom = new int[100][100];

        if( n == k || k == 0){
            return 1;
        } else if (binom[n][k] > 0){
            return binom[n][k];
        } else {
            binom[n][k] = memoization(n-1, k-1) + memoization(n-1,k);
            return binom[n][k];
        }

    }
}
