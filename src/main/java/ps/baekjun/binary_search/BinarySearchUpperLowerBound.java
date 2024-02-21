package ps.baekjun.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchUpperLowerBound {

    private static int[] arr = {1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 5, 6};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(binarySearch(n));
        System.out.println(lowerBound(n));
        System.out.println(upperBound(n));

    }

    private static int binarySearch(int value) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {

            int mid = (lo + hi) / 2;

            if (value > arr[mid]) {
                lo = mid + 1;
            } else if ( value < arr[mid]){
                hi =  mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private static int lowerBound(int value) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {

            int mid = (lo + hi) / 2;

            if (value > arr[mid]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo;
    }

    private static int upperBound(int value) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {

            int mid = (lo + hi) / 2;

            if (value >= arr[mid]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo;
    }

}
