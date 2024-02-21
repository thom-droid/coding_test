package ps.programmers.lvl01;

public class RemovalSmallestValue {

    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;
        int idx = 0;

        int[] answer = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
                idx = i;
            }

        }

        int k = 0;
        for (int i = 0; i < answer.length; i++) {

            if (idx == k) {
                k++;
            }

            answer[i] = arr[k];
            k++;
        }

        return answer;
    }

}
