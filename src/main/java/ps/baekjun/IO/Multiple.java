package ps.baekjun.IO;

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();


        solution(first, second);
    }

    public static void solution(int first, int second){
        String s = String.valueOf(second);
        int size = s.length();
        int[] arr = new int[size];
        int sum = 0;


        for(int i = 0; i <size; i++){
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
//            for(int j = size -1; j > i; j--){
//                arr[i] *= 10;
//            }
        }

        for(int i = size -1; i >=0; i--){
//            sum += first * arr[i];
            System.out.println(first*arr[i]);
        }


        System.out.println(first*second);
    }
}
