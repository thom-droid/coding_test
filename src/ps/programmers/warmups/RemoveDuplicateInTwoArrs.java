package ps.programmers.warmups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateInTwoArrs {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a","b","c"}, new String[]{"b","c"}));
        System.out.println(solution(new String[]{"a","b","c"}, new String[]{"com", "b","d","p","c"}));
        System.out.println(solution(new String[]{"n","omg"}, new String[]{"m"}));
    }

    private static int solution(String[] s1, String[] s2) {
        ArrayList<String> list1 = Arrays.stream(s1).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> list2 = Arrays.stream(s2).collect(Collectors.toCollection(ArrayList::new));
        list1.retainAll(list2);
        return list1.size();
    }
}
