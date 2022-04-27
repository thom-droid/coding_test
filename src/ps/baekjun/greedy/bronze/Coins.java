package ps.baekjun.greedy.bronze;

/* 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

    동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
* */

import java.util.Scanner;

public class Coins {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 동전의 종류
        int n = scanner.nextInt();

        // 목표 금액
        int k = scanner.nextInt();

        // 사용한 코인 개수
        int count = 0;

        // 각 동전별 계산을 위한 임시 변수
        int divisor = 0;

        int[] coin = new int[n];

        for(int i = 0; i < n; i++){
            coin[i] = scanner.nextInt();
        }

        for(int i = coin.length - 1; i >= 0; i--){
            if(k>=coin[i]){
                divisor = k / coin[i];
                count += divisor;
                k -= coin[i]* divisor;
            }
        }
        System.out.println(count);
    }

    public static int greedy(int sum){
        int[] coins = {1,5,10,50,100,500,1000,5000,10000,50000};
        int count = 0;
        int divisor = 0;

        for(int i = coins.length - 1; i >= 0; i--){
            if(sum>=coins[i]){
                divisor = sum / coins[i];
                count += divisor;
                sum -= coins[i] *divisor;
            }
        }

        return count;
    }

}
