package ps.programmers.lvl01;

import java.util.Scanner;

public class PrintRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int i1 = 0; i1 < a; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
