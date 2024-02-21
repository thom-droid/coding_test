package ps.programmers.skillcheck;

public class StringTest {

    public static void main(String[] args) {
        test();
    }

    public static void test(){

        String m = "ABCDEFG";
        int t = 5;
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while(t > 0){
            if(i == m.length()){
                i = 0;
            }
            sb.append(String.valueOf(m.charAt(i)));
            i++;
            t--;

        }

        System.out.println(sb.toString());

    }
}
