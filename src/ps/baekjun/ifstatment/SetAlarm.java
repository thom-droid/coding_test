package ps.baekjun.ifstatment;

import java.util.Scanner;

public class SetAlarm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String setTime = scanner.nextLine();

        String[] timeStr = setTime.split(" ");

        int hour = Integer.parseInt(timeStr[0]);
        int minute = Integer.parseInt(timeStr[1]);

        if(minute < 45){
            // 00시인 경우
            if(hour == 0){
                hour = 24;
            }
            hour--;
            minute += 15;
            print(hour, minute);
        } else if (minute >45) {
            minute -= 45;
            print(hour, minute);
        } else {
            minute = 0;
            print(hour, minute);
        }


    }
    public static void print(int hour, int minute){
        System.out.println(hour+ " " + minute);
    }
}
