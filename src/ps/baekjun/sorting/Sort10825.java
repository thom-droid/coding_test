package ps.baekjun.sorting;

import java.util.Comparator;

public class Sort10825 {

    static class Student {

        public String name;
        public Score score;

        static class Score {
            public int korean;
            public int english;
            public int math;

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


        public Student(String name, Score score) {
            this.name = name;
            this.score = score;
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
}
