package algo.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortDescending {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Character[] chars = new Character[s.length()];

        for(int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }

        Arrays.sort(chars, Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < chars.length; i++){
            sb.append(chars[i]);
        }

        System.out.println(sb);


    }
}
