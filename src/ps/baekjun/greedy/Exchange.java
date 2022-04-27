package ps.baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exchange {

    final static int PAYMENT = 1000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10, 5, 1};
        int exchange = PAYMENT - price;
        int count = 0;

        for(int i = 0; i < coins.length; i++){

            while(exchange>= coins[i]){
                int divisor = exchange / coins[i];
                count += divisor;
                exchange -= coins[i]*divisor;
            }
        }

        System.out.println(count);


    }
}
