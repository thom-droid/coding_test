package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.StringTokenizer;

public class WeirdString {

    public String solution(String s) {

        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (i > 1 && s.charAt(i - 1) != ' ') {
                    index = 0;
                } else {
                    index++;
                }
                sb.append(" ");
                continue;
            }

            if (index % 2 == 0) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            } else {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
            }

            index++;

        }

        return sb.toString();
    }

    public String solution2(String s) {
        String answer = "";
        boolean odd = false;

        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i)+"").isBlank()) {
                answer+= s.charAt(i)+"";
                odd=false;
                continue;
            }else {
                odd=!odd;
            }
            if(odd) {
                answer+= (s.charAt(i)+"").toUpperCase();
            }else {
                answer+= (s.charAt(i)+"").toLowerCase();
            }
        }
        return answer;
    }

    public String solution3(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "stop the     world    ";
        System.out.println(Arrays.toString(s.split("")));

    }

}
