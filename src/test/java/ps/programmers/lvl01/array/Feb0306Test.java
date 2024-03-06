package ps.programmers.lvl01.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb0306Test {

    Feb0306 feb0306 = new Feb0306();

    @Test
    void solution() {
        String[] wallpaper = {
                ".#..." ,
                "..#.." ,
                "...#."
        };
        int[] expected = {0, 1, 3, 4};
        int[] actual = feb0306.solution(wallpaper);
        assertArrayEquals(expected, actual);
    }

    @Test
    void solution2() {
            String[] wallpaper = {
                    ".........." ,
                    ".....#...." ,
                    "......##.." ,
                    "...##....." ,
                    "....#....."
            };
            int[] expected = {1, 3, 5, 8};
            int[] actual = feb0306.solution(wallpaper);
            assertArrayEquals(expected, actual);
    }

    @Test
    void solution3() {
        String[] wallpaper = {
                ".##...##." ,
                "#..#.#..#" ,
                "#...#...#" ,
                ".#.....#." ,
                "..#...#.." ,
                "...#.#..." ,
                "....#...."
        };
        int[] expected = {0, 0, 7, 9};
        int[] actual = feb0306.solution(wallpaper);
        assertArrayEquals(expected, actual);
    }

    @Test
    void solution4() {
        String[] wallpaper = {
                "..",
                "#."
        };
        int[] expected = {1, 0, 2, 1};
        int[] actual = feb0306.solution(wallpaper);
        assertArrayEquals(expected, actual);
    }
}