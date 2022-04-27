package algo.dp;

public class Knapsack {

    static int[] w = {0, 1, 2, 5, 6, 7};
    static int[] v = {0, 1, 6, 18, 22, 28};

    public static void main(String[] args) {

        System.out.println(maxProfit(5, 11));
    }

    public static int maxProfit(int item, int weight){
        int[][] opt = new int[item+1][weight+1];

        for(int i = 0; i <= weight; i++){
            opt[0][i] = 0;
        }

        for(int i = 0; i <= item; i++){
            opt[i][0] = 0;
        }

        for(int i = 1; i <= item; i++){

            for(int w = 1; w <= weight; w++){

                if(Knapsack.w[i] > w){
                    opt[i][w] = opt[i-1][w];
                } else {
                    opt[i][w] = Math.max(opt[i-1][w], (opt[i][w - Knapsack.w[i]] + v[i]));
                }
            }
        }
        return opt[item][weight];
    }
}
