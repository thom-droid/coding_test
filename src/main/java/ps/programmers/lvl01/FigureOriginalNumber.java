package ps.programmers.lvl01;

import java.util.HashMap;

public class FigureOriginalNumber {

    public static void main(String[] args) {
        String test1 = "one4seveneight";
        String test2 = "23four5six7";
        String test3 = "1zerotwozero3";

        System.out.println(solution(test1));
        System.out.println(solution(test2));
        System.out.println(solution(test3));

    }

    public static int solution(String s){
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i <10; i++){
            map.put(i, arr[i]);
        }
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < 10; i++){
            if(s.contains(map.get(i))){
                s = s.replaceAll(map.get(i), String.valueOf(i));
            }
        }

        int result = Integer.parseInt(s);

        return result;
    }
}
