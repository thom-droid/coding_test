package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class ForSangSoo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        for(int i = 0; i < arr.length; i++){
            StringBuffer sb = new StringBuffer();
            String s = arr[i];

            for(int j = s.length() -1; j >=0; j--){
                sb.append(s.charAt(j));
            }
            arr[i] = sb.toString();
        }
        OptionalInt max = Arrays.stream(arr).mapToInt(Integer::parseInt).max();

        System.out.println(max.getAsInt());


    }
}
