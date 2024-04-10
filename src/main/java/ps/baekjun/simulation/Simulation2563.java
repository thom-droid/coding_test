package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Simulation2563 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int totalArea;
        int overlappedArea = 0;
        int n = Integer.parseInt(readLine(bufferedReader));

        totalArea = 10 * 10 * n;

        List<Paper> papers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = readLine(bufferedReader).split(" ");
            Paper paper = new Paper(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            if (!papers.contains(paper)) {
                papers.add(paper);
            }
        }

        for (int i = 0; i < papers.size(); i++) {
            for (int j = i + 1; j < papers.size(); j++) {
                overlappedArea += papers.get(i).calculateOverlappedArea(papers.get(j));
            }
        }

        System.out.println(totalArea - overlappedArea);
    }

    public static class Paper {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Paper paper = (Paper) o;
            return x == paper.x && y == paper.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        private final int x;
        private final int y;

        public Paper(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int calculateOverlappedArea(Paper target) {
            if (isOverlap(target)) {
                int x1 = calculateLength(x, target.getX());
                int y1 = calculateLength(y, target.getY());
                return x1 * y1;
            }
            return 0;
        }

        private boolean isOverlap(Paper target) {
            return isOverlap(x, target.getX()) && isOverlap(y, target.getY());
        }

        private boolean isOverlap(int x, int x1) {
            int abs = Math.abs(x - x1);
            return abs <= 9 && abs >= 1;
        }

        private int calculateLength(int x1, int x2) {
            return 10 - Math.abs(x1 - x2);
        }
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
