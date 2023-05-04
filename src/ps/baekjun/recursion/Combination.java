package ps.baekjun.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combination {

    public static void main(String[] args) throws IOException {

        // 뽑을 기준이 되는 배열
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        // 출력 배열
        int[] arr2 = new int[arr1.length];
        // 뽑을 갯수
        int r = 3;

        // 5C3
        combination(arr2, arr1, 6, 0, 0, 6);

    }

    // arr1 == 대상 배열
    // comb == 출력 배열
    // r == 선택할 수 있는 갯수
    // index == 출력 배열 인덱스
    // depth == 대상 배열에서 선택할 값이 있는 인덱스
    // len == nCr에서 r에 해당
    private static void combination(int[] arr1, int[] comb, int r, int index, int depth, int len) {

        // 뽑을 수 있는 모든 수를 뽑았을 때 출력
        if (r == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                sb.append(comb[i]);
            }
            System.out.println(sb);

            // 인풋 배열의 끝까지 온 경우 종료
        } else if (arr1.length == depth) {
            return;
        } else {

            comb[index] = arr1[depth];

            // 특정 인덱스에서 그 인덱스의 값을 택한 경우
            // 두 배열 모두 인덱스가 증가
            // 뽑을 수 있는 수는 감소
            combination(arr1, comb, r-1,index + 1, depth + 1, len);

            // 그 인덱스의 값을 선택하지 않은 경우
            // 대상 배열의 인덱스는 값이 비어있게 되므로 놔두고, 실제 값을 가지고 있는 배열의 인덱스만 증가
            // 뽑지 않았으므로 left는 유지
            combination(arr1, comb, r, index, depth +1, len);
        }

    }
}
