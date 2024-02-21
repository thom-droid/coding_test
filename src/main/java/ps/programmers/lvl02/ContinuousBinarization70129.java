package ps.programmers.lvl02;

public class ContinuousBinarization70129 {

    public int[] solution(String s) {

        int zeroCounter = 0;
        int loop = 0;

        while (s.length() > 1) {
            int originalSize = s.length();
            s = s.replaceAll("0", "");
            int subSize = s.length();

            zeroCounter += originalSize - subSize;

            StringBuilder sb = new StringBuilder();

            while (subSize >= 1) {
                sb.append(subSize % 2);
                subSize /= 2;
            }

            s = sb.toString();
            loop++;
        }

        return new int[]{loop, zeroCounter};
    }

    public int[] solution2(String s) {

        int zeroCounter = 0;
        int loop = 0;

        while (s.length() > 1) {
            int originalSize = s.length();
            s = s.replaceAll("0", "");
            int subSize = s.length();

            zeroCounter += originalSize - subSize;

            s = Integer.toBinaryString(subSize);

            loop++;
        }

        return new int[]{loop, zeroCounter};
    }


}
