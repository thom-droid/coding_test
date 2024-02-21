package ps.programmers.lvl01;

import java.util.Scanner;

public class PointStar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        solution(a);

    }

    public static void solution(int n){


        for(int i = 0; i < n; i++){

            System.out.print("*");
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
