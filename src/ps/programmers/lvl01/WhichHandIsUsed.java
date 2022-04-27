package ps.programmers.lvl01;

import java.util.HashSet;

public class WhichHandIsUsed {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        int len = solution(numbers, hand).length();
        System.out.println(numbers.length);
        System.out.println(len);

    }

    public static String solution(int[] numbers, String hand) {

        HashSet<Integer> left = new HashSet<>(3);
        HashSet<Integer> right = new HashSet<>(3);
        HashSet<Integer> mid = new HashSet<>(4);

        for (int i = 1; i < 4; i++) {
            left.add(3 * i - 2);
            right.add(3 * i);
            mid.add(3 * i - 1);
        }
        mid.add(0);

        int left_pointer = 1;
        int right_pointer = 1;

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < numbers.length; i++) {

            if (left.contains(numbers[i])) {
                left_pointer = numbers[i];
                sb.append("L");

            } else if (right.contains(numbers[i])) {
                right_pointer = numbers[i];
                sb.append("R");

            } else if (mid.contains(numbers[i])) {

                if (hand.equals("right")) {

                    // 양 손이 모두 같은 높이에 있을 때
                    if (right_pointer - 2 == left_pointer) {
                        right_pointer = numbers[i];
                        sb.append("R");

                        // 오른손이 가운데 라인에 있을 때
                    } else if (numbers[i] - 1 == left_pointer) {
                        right_pointer = numbers[i];
                        sb.append("R");
                    } else if (numbers[i] == 0) {
                        right_pointer = numbers[i];
                        sb.append("R");
                    }


//                } else {
//                    if (pointer + 1 == numbers[i]) {
//                        sb.append("L");
//                    } else if (pointer - 1 == numbers[i]) {
//                        sb.append("R");
//                    }
//                }
//
//            }
//
//            pointer = numbers[i];

                }

            }

        }
        return sb.toString();
    }
}

