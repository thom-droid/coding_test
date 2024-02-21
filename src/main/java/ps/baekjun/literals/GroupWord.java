package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GroupWord {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];

        for(int i = 0; i < arr.length; i++){
            arr[i] = br.readLine();
        }

        int count = 0;
        String s = "aaaaabbbaadd";
        String s1  = "aaaaaa";
        String s2 = "bbadd";
        String s4 = "aabaa";
        for (String value : arr) {
            if (isGroupWord(value))
                count++;
        }

        System.out.println(count);
    }
    public static boolean isGroupWord(String s){

        String[] arr = new String[s.length()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = String.valueOf(s.charAt(i));
        }

        String[] arr2 = Arrays.stream(arr).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));

        for(int i = 0; i < arr2.length; i++){

            int len = 0;
            int last = s.lastIndexOf(arr2[i]);
            int first = s.indexOf(arr2[i]);

            for(int j = 0; j < arr.length; j++){
                if(arr2[i].equals(arr[j]))
                    len++;
            }

            int val1 = len;
            int val2 = s.substring(first, last+1).length();

            System.out.println(val1);
            System.out.println(val2);
            if(val1 != val2)
                return false;

            System.out.println(i + " loop ended");
        }

        return true;

    }
}
