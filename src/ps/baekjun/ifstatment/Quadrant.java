package ps.baekjun.ifstatment;

import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        whereToBelong(x, y);

    }

    public static void whereToBelong(int x, int y){
        if(x > 0 && y > 0)
            System.out.println(1);

        if(x < 0 && y > 0)
            System.out.println(2);

        if(x < 0 && y < 0)
            System.out.println(3);

        if(x > 0 && y < 0)
            System.out.println(4);
    }
}
