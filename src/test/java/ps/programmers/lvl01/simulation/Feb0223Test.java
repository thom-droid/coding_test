package ps.programmers.lvl01.simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb0223Test {

    Feb0223 feb0223 = new Feb0223();

    @Test
    void solution() {
        String today = "2021.02.23";
        String[] terms = {"A 1", "B 2", "C 3"};
        String[] privacies = {"2021.01.23 A", "2021.01.23 B", "2021.01.25 C"};
        int[] expected = {1};
        int[] solution = feb0223.solution(today, terms, privacies);
        assertArrayEquals(expected, solution);
    }

    @Test
    void test2() {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] expected = {1, 3};
        assertArrayEquals(expected, feb0223.solution(today, terms, privacies));
    }

    @Test
    void test3() {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] expected = {1, 4, 5};
        assertArrayEquals(expected, feb0223.solution(today, terms, privacies));
    }
}