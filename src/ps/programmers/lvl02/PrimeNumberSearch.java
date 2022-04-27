package ps.programmers.lvl02;

import java.util.LinkedList;

public class PrimeNumberSearch {

    private LinkedList<Integer> adj[];


    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5;j++){
                System.out.println(i +" , " +j);
            }
        }
    }

    public static int solution(String numbers){
        int itr = numbers.length();
        return 0;
    }

    public static boolean isPrime(int num){

        if(num < 2){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
