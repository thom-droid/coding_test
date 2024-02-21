package ps.programmers.lvl01;

public class StringHandler12918 {

    public boolean solution(String s) {

        boolean answer = false;

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        try {
            Integer.parseInt(s);
        } catch (NumberFormatException npe){
            return false;
        }

        return true;
    }
}
