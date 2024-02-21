package ps.baekjun.greedy.bronze.io;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Syso10952 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
            if(num == 0){
                break;
            }
            System.out.println(num);
        }


    }
}
