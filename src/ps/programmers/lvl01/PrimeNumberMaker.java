package ps.programmers.lvl01;

public class PrimeNumberMaker {

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];

                    int val = a + b + c;

                    if (isPrimeNumber(val)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private boolean isPrimeNumber(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
