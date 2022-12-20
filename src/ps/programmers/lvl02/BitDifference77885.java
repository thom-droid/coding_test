package ps.programmers.lvl02;

import org.testng.util.Strings;

public class BitDifference77885 {

    public long[] solution2(long[] numbers) {

        // 3 -> 11 // 4 -> 100 , 5 -> 101, 6-> 110, 7 -> 111, 8 -> 1000, 9 -> 1001, 10 -> 1010, 11 -> 1011
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            long number = numbers[i];
            long next = number;
            long min = number;

            while (min == number) {

                next++;

                String binary = Long.toString(number, 2);
                String binary2 = Long.toString(next, 2);

                int difference = binary2.length() - binary.length();
                int start = difference;

                for (int j = start; j < binary2.length(); j++) {

                    if (binary.charAt(j - start) != binary2.charAt(j)) {
                        difference++;
                    }

                }

                if (difference <= 2) {
                    min = next;
                }

            }

            answer[i] = min;

        }


        return answer;
    }


    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            long number = numbers[i];

            if (number % 2 == 0) {
                answer[i] = number + 1;
                continue;
            }

            String binary = Long.toString(number, 2);
            int index = binary.lastIndexOf("0");
            long value;

            if (index < 0) {
                int length = binary.length();
                value = (long) Math.pow(2.0, length);
            } else {
                index = binary.length() - index - 1;
                value = (long) Math.pow(2.0, index) ;
            }

            answer[i] = value / 2 + number;

        }

        return answer;
    }
}
