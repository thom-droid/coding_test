package ps.programmers.lvl02;

public class ArrayManipulation87390 {

    public int[] solution(int n, long left, long right) {
        int[] arr = new int[(int) (right - left) + 1];

        for (long i = 0; i < arr.length; i++) {

            long val = i + left;
            long row = val / n;
            long col = val % n;

            long k = row > col ? row + 1 : col + 1;

            arr[(int) i] = (int) k;
        }

        return arr;
    }

    public int[] solution2(int n, long left, long right) {

        int size = (int) (right - left);
        int[] arr = new int[(size / n + 1) * n];
        int[] answer = new int[size + 1];
        long tmp = left;

        for (int i = 0; i < arr.length; i += n) {

            for (int j = i; j < n + i; j++) {

                if (j % n < (int) (tmp / n) + 1) {
                    arr[j] = (int) tmp / n + 1;
                } else {
                    arr[j] = j % n + 1;
                }

            }

            tmp++;
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[(int) left++];
        }

        return answer;
    }

}
