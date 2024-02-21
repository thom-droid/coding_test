package ps.programmers.lvl02;

import java.util.HashSet;

public class PartialSequence131701 {

    public int solution(int[] elements) {

        int k = elements.length;
        HashSet<Integer> set = new HashSet<>();

        // 부분 수열의 크기 (크기 1부터 배열의 길이만큼의 크기를 가지는 부분 수열 개수만큼 순회)
        for (int i = 1; i <= k; i++) {

            // 크기 i인 수열의 전체 순회 (전체 배열에서 1 크기인 수열로 순회)
            for (int j = 0; j < k; j++) {

                int sum = 0;

                // 수열의 크기 만큼 순회(크기 2라면 [0,1], [1,2] ... )
                for (int m = j; m < i + j; m++) {
                    int n = m;

                    if (m >= k) {
                        n = m % k;
                    }

                    sum += elements[n];
                }

                set.add(sum);
            }
        }

        return set.size();
    }

}
