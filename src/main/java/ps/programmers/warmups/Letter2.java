package ps.programmers.warmups;

public class Letter2 {

    public static void main(String[] args) {

        System.out.println(removeDuplication("aEbcdEe", "E"));

    }
    public static String removeDuplication(String my_string, String letter) {

        if (my_string.contains(letter)) {
            return my_string.replaceAll(letter, "");
        }

        return my_string;
    }
}
