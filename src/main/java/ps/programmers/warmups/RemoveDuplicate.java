package ps.programmers.warmups;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public String solution(String my_string) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            set.add(String.valueOf(my_string.charAt(i)));
        }

        return String.join("", set);
    }
}
