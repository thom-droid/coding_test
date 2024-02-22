package ps.programmers.lvl01.simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb0222_01Test {

    Feb0222_01 feb0222_01 = new Feb0222_01();

    @Test
    void solution() {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String expected = "Yes";
        String result = feb0222_01.solution(cards1, cards2, goal);
        assertEquals(expected, result);
    }

    @Test
    void solution2() {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String expected = "No";
        String result = feb0222_01.solution(cards1, cards2, goal);
        assertEquals(expected, result);
    }

    @Test
    void solution3() {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "coffee"};
        String expected = "No";
        String result = feb0222_01.solution(cards1, cards2, goal);
        assertEquals(expected, result);
    }

    @Test
    void solution4() {
        String[] cards1 = {"this", "an", "pen"};
        String[] cards2 = {"is", "apple", "this", "is", "a"};
        String[] goal = {"this", "is", "an", "apple", "this", "is", "a", "pen"};
        String expected = "Yes";
        String result = feb0222_01.solution(cards1, cards2, goal);
        assertEquals(expected, result);
    }

    @Test
    void solution5() {
        String[] cards1 = {"banana", "banana", "banana"};
        String[] cards2 = {"banana", "apple", "apple", "apple", "pineapple"};
        String[] goal = {"banana", "banana", "banana", "banana", "apple", "apple", "apple", "pineapple"};
        String expected = "Yes";
        String result = feb0222_01.solution(cards1, cards2, goal);
        assertEquals(expected, result);
    }

    @Test
    void solution6() {
        String[] cards1 = {"a", "d"};
        String[] cards2 = {"a", "d", "c"};
        String[] goal = {"a", "d", "c", "a", "d"};
        String expected = "Yes";
        String result = feb0222_01.solution(cards1, cards2, goal);
        assertEquals(expected, result);
    }

    @Test
    void solution7() {
        String[] cards1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] cards2 = {"string", "or", "integer"};
        String[] goal = {"string", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String expected = "Yes";
        String result = feb0222_01.solution(cards1, cards2, goal);
        assertEquals(expected, result);
    }
}