package ps.programmers.warmups;

public class ComingUp {

    public int solution(int[] common) {
        double k = common[1] - common[0];

        if (common[2] - common[1] == k) {
            return (int) (common[common.length - 1] + k);
        } else {
            k = common[1] / common[0];
            return (int) (common[common.length - 1] * k);
        }
    }
}
