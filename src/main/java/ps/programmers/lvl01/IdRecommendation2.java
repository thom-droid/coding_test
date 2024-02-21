package ps.programmers.lvl01;

public class IdRecommendation2 {

    public static void main(String[] args) {
        System.out.println(solution( "...!@BaT#*..y.abcdefghijklm"));
    }

    public static String solution(String s){
        long start = System.currentTimeMillis();
        String regex = "[^-_.a-z0-9]";
        // 1
        s = s.toLowerCase();

        // 2
        s = s.replaceAll(regex, "");

        // 3
        s = s.replaceAll("[.]{2,}", ".");

        // 4
        s = s.replaceAll("^[.]|[.]$", "");

        // 5
        if(s.length() == 0){
            s += "a";
        }

        // 6
        if(s.length() >= 16){
            s = s.substring(0, 15).replaceAll("^[.]|[.]$", "");
        }

        // 7
        if(s.length() <=2){
            while(s.length() < 3){
                s += s.charAt(s.length()-1);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("걸린 시간 : "+ (end - start));
        return s;
    }

}
