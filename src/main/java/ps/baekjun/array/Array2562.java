package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Array2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        IntStream.range(0, array.length)
                .mapToObj(i -> new ValueWithIndex(array[i], i))
                .reduce((a, b) -> a.getValue() >= b.getValue() ? a : b)
                .ifPresent(valueWithIndex -> {
                    System.out.println(valueWithIndex.getValue());
                    System.out.println(valueWithIndex.getIdx() + 1);
        });

    }



    static class ValueWithIndex {
        private int value;
        private int idx;

        public ValueWithIndex(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }

        public int getValue() {
            return value;
        }

        public int getIdx() {
            return idx;
        }
    }


    private static int readLine(BufferedReader bufferedReader) {
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
