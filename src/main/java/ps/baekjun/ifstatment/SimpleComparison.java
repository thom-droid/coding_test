package ps.baekjun.ifstatment;

import java.util.Scanner;

public class SimpleComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String intValues = scanner.nextLine();
        String[] strArr = intValues.split(" ");

        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);

        if(num1 > num2){
            System.out.println(">");
        } else if (num1 < num2){
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }
}
