package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Syso11721 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if(!(str.length() % 10 == 0)){
            int divisor = str.length() / 10;
            String subString1 = str.substring(0, divisor*10);
            String subString2 = str.substring(divisor*10);

            for(int i = 0; i < subString1.length(); i+=10){
                for(int j = i; j < i +10; j++){
                    System.out.print(str.charAt(j));
                }
                System.out.println("");
            }
            System.out.print(subString2);

        } else {

            for(int i = 0; i < str.length(); i+=10){
                for(int j = i; j < i +10; j++){
                    System.out.print(str.charAt(j));
                }
                System.out.println("");
            }
        }
    }

    // 다른 답안
    public static void solution(String str){
        for(int i = 0; i < str.length(); i++ ){
            System.out.print(str.charAt(i));

            // 10번째 차례에 줄 바꿔주기. 매번 if를 수행하므로 속도가 아주 조끔 느리다..
            if(i%10==9){
                System.out.println("");
            }
        }
    }
}
