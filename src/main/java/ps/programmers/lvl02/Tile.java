package ps.programmers.lvl02;

public class Tile {

    public int solution(int n) {
        if (n <= 1) {
            return 0;
        }

        if (n == 2) {
            return 3;
        }

        double val = (double) n / 2;
        double val2 = (double) n / 4;

        if (n % 4 == 0) {
            return (int) (Math.pow(3.0, val) + Math.pow(2.0, val2));
        }

        return (int) (Math.pow(3.0, val) + (Math.pow(2.0, val2) * Math.pow(3.0, val2 + 1)));

    }
}

class TileMain {
    public static void main(String[] args) {
        Tile tile = new Tile();
        System.out.println(tile.solution(100));
    }
}
