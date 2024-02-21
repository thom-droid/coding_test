package algo.brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

//        System.out.println(isPrime(num));
        System.out.println(Arrays.toString(primeArray(num)));
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

    public static int[] primeArray(int num){
        int[] arr = new int[50];
        int pn = 0;
        boolean[] erased = new boolean[101];

        for(int i = 2; i<num; i++){
            if(!erased[i]){
                arr[pn++] = i;
            }
            for(int j = 2*i; j < num; j += i){
                erased[j] = true;
            }
        }
        System.out.println(Arrays.toString(erased));
        return arr;
    }
}
