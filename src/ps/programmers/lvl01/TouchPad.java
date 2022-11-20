package ps.programmers.lvl01;

public class TouchPad {

    public String solution(int[] numbers, String hand) {

        int[] left = {4, 1};
        int[] right = {4, 3};

        StringBuilder sb = new StringBuilder();

        for (int val : numbers) {

            int row;
            int col;

            if (val == 0) {
                col = 2;
            } else if (val % 3 == 0) {
                col = 3;
            } else {
                col = val % 3;
            }

            if (val == 0) {
                row = 4;
            } else if (val <= 3 && val > 0) {
                row = 1;
            } else if (val <= 6) {
                row = 2;
            } else {
                row = 3;
            }

            // left area
            if (val == 1 || val == 4 || val == 7) {
                setLeft(sb, left, row, col);
                continue;
            }

            // right area
            if (val == 3 || val == 6 || val == 9) {
                setRight(sb, right, row, col);
                continue;
            }

            if (val == 2 || val == 5 || val == 8 || val == 0) {
                int distanceFromLeft = Math.abs(row - left[0]) + Math.abs(col - left[1]);
                int distanceFromRight = Math.abs(row - right[0]) + Math.abs(col - right[1]);

                if (distanceFromLeft < distanceFromRight) {
                    setLeft(sb, left, row, col);
                } else if (distanceFromRight < distanceFromLeft) {
                    setRight(sb, right, row, col);
                } else {
                    if (hand.equals("right")) {
                        setRight(sb, right, row, col);
                    } else {
                        setLeft(sb, left, row, col);
                    }
                }

            }
        }

        return sb.toString();
    }

    private void setLeft(StringBuilder sb, int[] left, int row, int col) {
        sb.append("L");
        left[0] = row;
        left[1] = col;
    }

    private void setRight(StringBuilder sb, int[] right, int row, int col) {
        sb.append("R");
        right[0] = row;
        right[1] = col;
    }
}
