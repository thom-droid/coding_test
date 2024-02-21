package ps.baekjun.IO;

import java.util.Scanner;

public class BuddhaCalendar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int buddhaYear = in.nextInt();

        int anno = buddhaYear - 543;

        System.out.println(anno);
    }
}
