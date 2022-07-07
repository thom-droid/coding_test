package algo.graph.twoPointer;

public class TwoPointer {

    static int[] arr;

    private static void twoPointer(int target) {

        int s = 0;
        int e = 0;
        int count = 0;
        int p = 0;
        int N = arr.length;
        while (e <= N) {

            if (p < target) {
                p += arr[e++];
            } else if(p > target) {
                p -= arr[s++];
            } else {
                count++;
                p += arr[e++];
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        arr = new int[]{2, 4, 1, 2, 5, 3, 1, 2};
        twoPointer(3);
    }
}
