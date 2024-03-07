package ps.programmers.lvl01.array;

public class Mar0306 {

    public int[] solution(String[] wallpaper) {
        int lux = wallpaper.length - 1;
        int luy = wallpaper[0].length() - 1;
        int rdx = 0;
        int rdy = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        return new int[]{lux, luy, rdx + 1, rdy + 1};
    }

}
