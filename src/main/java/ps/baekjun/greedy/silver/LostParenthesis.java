package ps.baekjun.greedy.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LostParenthesis {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // - 를 기준으로 숫자를 제거.
        String[] str = s.split("-");
        int size = str.length;

        System.out.println(Arrays.toString(str));

        // 값 계산을 위한 int 배열
        int[] numbers = new int[size];

        // str 배열 내의 값들을 int로 변환한 뒤 더해서 int 배열에 대입
        for(int i = 0; i < str.length; i++){
            int sum = Arrays.stream(str[i].split("\\+")).mapToInt(Integer::parseInt).sum();
            numbers[i] = sum;
        }

        // 맨 앞자리 수에 빼기
        for(int i = 1; i < numbers.length; i++){
            numbers[0] -= numbers[i];
        }

        System.out.println(numbers[0]);
    }
}
