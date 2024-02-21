package ps.programmers.warmups;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharAppearedOnce {

    public String solution(String s) {
        String[] arr = s.split("");
        return Arrays.stream(arr)
                .filter(s1 -> Arrays.stream(arr).filter(s2 -> s2.equals(s1)).count() == 1)
                .sorted()
                .collect(Collectors.joining());
    }


    // much faster..
    public String solution2(String s) {
        int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();
    }
}
