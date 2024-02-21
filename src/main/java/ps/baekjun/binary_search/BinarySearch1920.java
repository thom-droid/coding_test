package ps.baekjun.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//Silver 4
public class BinarySearch1920 {

    static int[] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(data);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()) {
            int dataToCompare = Integer.parseInt(st.nextToken());
//            sb.append(binarySearchWitWhile(dataToCompare)).append("\n");
            sb.append(binarySearch(0, data.length -1, dataToCompare)).append("\n");
        }


        System.out.println(sb);

    }

    private static int binarySearchWitWhile(int valueToCompare) {
        int start = 0;
        int end = data.length - 1;

        while (start <= end) {
            int pivot = (start + end) / 2;
            int value = data[pivot];
            if (value == valueToCompare) {
                return 1;
            }

            if (valueToCompare > value) {
                start = pivot + 1;
            } else {
                end = pivot - 1;
            }
        }
        return 0;
    }
    private static int binarySearch(int start, int end, int element) {

        // 같으면 리턴
        if (start > end) {
            return 0;
        }

        int pivot = (start + end) / 2;
        int pivotValue = data[pivot];

        if (element == pivotValue) {
            return 1;
        }

        if (element < pivotValue) {
            return binarySearch(start, pivot - 1, element);
        } else {
            return binarySearch(pivot + 1, end, element);
        }

    }

}
