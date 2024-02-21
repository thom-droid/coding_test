package ps.baekjun.greedy;

import java.util.StringTokenizer;

public class StringTest {

    public static void main(String[] args) {
//        String s = "3+3";
//        String s1 = "5+2-2";
//        String test = "003";
        String arr = "test happy healthier";
//        int h = Integer.parseInt(test);
//        System.out.println(h);
//        String[] arr = s1.split("=");
        StringTokenizer st = new StringTokenizer(arr, " ");
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        String s4 = st.nextToken();
        System.out.println(s4==null);

//        StringTokenizer stn = new StringTokenizer(s1, "+");
//        System.out.println(stn.nextToken());
    }
}
