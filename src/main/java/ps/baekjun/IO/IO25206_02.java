package ps.baekjun.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class IO25206_02 {

    public static void main(String[] args) {
        Map<String, Double> grades = Map.of(
                "A+", 4.5,
                "A0", 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
        );

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCourses = 20;
        double sum = 0.0;
        double sum1 = 0.0;

        for (int i = 0; i < numberOfCourses; i++) {
            String input;
            try {
                input = bufferedReader.readLine();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            String[] parts = input.split(" ");
            if (parts.length < 3) {
                throw new IllegalArgumentException("Input format error: each line should contain name, credits, and grade separated by space");
            }

            String grade = parts[2];
            double credit = Double.parseDouble(parts[1]);

            if (!grade.equals("P")) {
                sum += grades.getOrDefault(grade, 0.0) * credit;
                sum1 += credit;
            }

        }
//        if (sum1 == 0) {
//            System.out.println(0.0);
//            return;
//        }
        System.out.println(sum / sum1);
    }
}
