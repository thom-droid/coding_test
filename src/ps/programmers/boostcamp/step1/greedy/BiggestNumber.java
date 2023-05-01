package ps.programmers.boostcamp.step1.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class BiggestNumber {

    public String solution(int[] numbers) {

        StringBuilder sb = new StringBuilder();

        Arrays.stream(numbers).mapToObj(String::valueOf).sorted((o1, o2) ->
                        (o2+o1).compareTo(o1+o2))
                .forEach(sb::append);

        if(sb.charAt(0) == '0'){
            return "0";
        }

        return sb.toString();

    }

    public String falsySolution(int[] numbers) {

        // 9 5 3 34 30
        // 95 59 -> 95
        // 95 953 935 -> 953
        // 95334  95343 -> 95343
        // 9534330 9534303 -> 9534330

        // 정렬 먼저 -> 길이가 같으면 큰 수. 길이가 다르면 앞자리수가 큰 것 78 7 787 778 -> 계속 같으면?
        // 앞뒤로 바꿔 붙여가면서 큰 수 비교
        // 큰 수의 앞의 수 선택
        // 남은 수와 다음 수를 다시 비교
        // 큰 수 선택 ..

        Comparator<Integer> comparator = (o1, o2) -> String.valueOf(o2).compareTo(String.valueOf(o1));
        LinkedList<Integer> sorted = Arrays.stream(numbers).boxed().sorted(comparator).collect(Collectors.toCollection(LinkedList::new));
        StringBuilder sb = new StringBuilder();

        while (!sorted.isEmpty()) {
            if (sorted.size() == 1) {
                sb.append(sorted.get(0));
                break;
            }

            Integer a = sorted.get(0);
            Integer b = sorted.get(1);

            String a2 = String.valueOf(a);
            String b2 = String.valueOf(b);

            int a3 = Integer.parseInt(a2 + b2);
            int b3 = Integer.parseInt(b2 + a2);

            if (a3 >= b3) {
                sb.append(a);
                sorted.remove(a);
            } else {
                sb.append(b);
                sorted.remove(b);
            }

        }

        return sb.toString();
    }

}
