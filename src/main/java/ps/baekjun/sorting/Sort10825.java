package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Sort10825 {

     static class Student {

        public String name;
        public Score score;

        public Student (String name, Score score) {
             this.name = name;
             this.score = score;
        }


         static class Score {


            public int korean;
            public int english;
            public int math;

            public Score(int korean, int english, int math) {
                this.korean = korean;
                this.english = english;
                this.math = math;
            }

            public Score() {
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Score score = (Score) o;

                if (korean != score.korean) return false;
                if (english != score.english) return false;
                return math == score.math;
            }
            @Override
            public int hashCode() {
                int result = korean;
                result = 31 * result + english;
                result = 31 * result + math;
                return result;
            }

        }

    }


    private static final Comparator<Student> scoreComparator = (o1, o2) -> {

        if (o1.score.equals(o2.score)) {
            return o1.name.compareTo(o2.name);
        }

        if (o2.score.korean == o1.score.korean && o2.score.english == o1.score.english) {
            return o2.score.math - o1.score.math;
        }

        if (o2.score.korean == o1.score.korean) {
            return o1.score.english - o2.score.english;
        }


        return o2.score.korean - o1.score.korean;
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Student> list = new ArrayList<>(N);

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            Student student = new Student(name, new Student.Score(korean, english, math));
            list.add(student);
        }


        list.sort(scoreComparator);


        list.forEach(student -> System.out.println(student.name));
    }
}
