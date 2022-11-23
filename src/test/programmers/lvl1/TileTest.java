package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl02.Tile;

import static org.junit.Assert.*;

public class TileTest {

    Tile tile = new Tile();

    @Test
    public void solution() {

        int expected = 27;
        int result = tile.solution(1000);

        System.out.println(result);
//        assertEquals(expected, result);

    }
}