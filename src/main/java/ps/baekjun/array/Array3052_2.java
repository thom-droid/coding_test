package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Array3052_2 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(readLine(bufferedReader)) % 42);
        }
        System.out.println(set.size());
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
