package ps.baekjun.literals;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Duplication {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        int[] loop = new int[cases];
        String[] strings = new String[cases];
        StringTokenizer st;
        for(int i = 0; i < cases; i++){
            st = new StringTokenizer(br.readLine(), " ");
            loop[i] = Integer.parseInt(st.nextToken());
            strings[i] = st.nextToken();
        }

        for(int i = 0; i < cases; i++){
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < strings[i].length(); j++){
                for(int k = 0; k < loop[i]; k++){
                    sb.append(strings[i].charAt(j));
                }
            }
            System.out.println(sb);
        }

//        String str = "abcd";
//        int loops = 4;
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < str.length(); i++){
//            for(int j = 0; j < loops; j++){
//                sb.append(str.charAt(i));
//            }
//        }
//        System.out.println(sb);
//        System.out.println(Arrays.toString(loop));
//        System.out.println(Arrays.deepToString(strings));


    }
}
