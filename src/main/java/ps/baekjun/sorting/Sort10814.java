package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//silver 5
public class Sort10814 {
    static class User {

        public int signedOrder;

        public int age;
        public String name;
        public User(int signedOrder, int age, String name) {
            this.signedOrder = signedOrder;
            this.age = age;
            this.name = name;
        }

    }

    private static final Comparator<User> userComparator = (o1, o2) -> {
        if (o1.age == o2.age) {
            return o1.signedOrder - o2.signedOrder;
        }

        return o1.age - o2.age;
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<User> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new User(i, age, name));
        }

        Collections.sort(list, userComparator);

        StringBuilder sb = new StringBuilder();

        for (User user : list) {
            sb.append(user.age).append(" ").append(user.name).append('\n');
        }

        System.out.println(sb);
    }
}
