package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.regex.Pattern;

public class IdRecommendation {

    public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijklm..";
        String test2 = "z-+.^.";
        String test3 = "=.=";
        String test4 = "123_.def";
        String test5 = "abcdefghijklmn.p";
        solution(new_id);
        solution(test2);
        solution(test3);
        solution(test4);
        solution(test5);
    }

    public static String solution(String new_id){
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();

        // 1. lowercase
        String loweredStr = new_id.toLowerCase();

        // 2. regex
        Pattern p = Pattern.compile("[~!@#$%^&*()=+\\[{\\]}:?,<>/]");

        // 배열 많이 만들어져서 메모리 낭비 있음.
        Arrays.stream(p.split(loweredStr)).forEach(sb::append);

        // 3. replace  multiple dots with a single dot
        int k = 1;
        while(k < sb.length()){
            if(String.valueOf(sb.charAt(k-1)).equals(".") && String.valueOf(sb.charAt(k)).equals(".")){
                sb.replace(k-1, k, "");
            } else {
                k++;
            }
        }

        // 4. remove single dots flailing at the start or end of the string
        if(sb.length() != 0){
            if(sb.indexOf(".") == 0){
                sb.deleteCharAt(0);
            }
        }

        if(sb.length() != 0){
            if(String.valueOf(sb.charAt(sb.length()-1)).equals(".")){
                sb.deleteCharAt(sb.length()-1);
            }
        }


        // 5. if string is empty, add "a"
        if(sb.length() == 0){
            sb.append("a");
        }

        // 6. if the length of string is larger than 16, trim the characters from the end so that first 15 letters are to remain
        if(sb.length() >= 16){
            sb.delete(15, sb.length());
        }

        if(sb.lastIndexOf(".") == sb.length()-1){
            sb.deleteCharAt(sb.length()-1);
        }

        // 7. if the processed string is shorter than or equal to 2, then append the last character to the end of the string until its length reaches 3
        if(sb.length() <= 2){
            char c = sb.charAt(sb.length()-1);

            int len = sb.length();
            for(int i = 0; i < 3 - len; i++){
                sb.append(c);
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("걸린 시간 : "+ (end - start));
        return sb.toString();
    }
}
