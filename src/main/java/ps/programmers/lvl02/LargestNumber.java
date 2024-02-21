package ps.programmers.lvl02;

import java.util.Arrays;

// 정렬
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        int[] arr2 = {0,0,0,0,0};
        System.out.println(solution(arr));
        System.out.println(solution(arr2));
    }

    public static String solution(int[] numbers){
        StringBuffer sb = new StringBuffer();

        Arrays.stream(numbers).mapToObj(String::valueOf).sorted((o1, o2) ->
                (o2+o1).compareTo(o1+o2))
                .forEach(sb::append);

        if(sb.charAt(0)=='0'){
            return "0";
        }

        return sb.toString();

    }
}
