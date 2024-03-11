package ps.programmers.lvl01.simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mar0311Test {

    Mar0311 test = new Mar0311();

    @Test
    void solution() {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        int actual = test.solution(friends, gifts);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void solution2() {
        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        int actual = test.solution(friends, gifts);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void solution3() {
        String[] friends = {"a", "b", "c"};
        String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
        int actual = test.solution(friends, gifts);
        int expected = 0;
        assertEquals(expected, actual);
    }
}