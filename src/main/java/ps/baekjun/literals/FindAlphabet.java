package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlphabet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] alphabets = new String[26];
        char[] chars = new char[26];

        for(int i = 0; i <= 25; i++){
            chars[i] = (char) (i+97);
            alphabets[i] = Character.toString(chars[i]);
        }

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i <= 25; i++){
            if(s.contains(alphabets[i])){
                sb.append(String.valueOf(s.indexOf(alphabets[i])));
            } else {
                sb.append("-1");
            }
            sb.append(" ");
        }


        System.out.println(Arrays.toString(alphabets));
        System.out.println(sb);



    }
}
