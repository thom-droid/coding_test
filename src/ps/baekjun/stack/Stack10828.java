package ps.baekjun.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

// silver 4
public class Stack10828 {

    private static final ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String instruction = br.readLine();
            if (instruction.startsWith("push")) {
                StringTokenizer st = new StringTokenizer(instruction, " ");
                st.nextToken();
                int data = Integer.parseInt(st.nextToken());
                push(data);
            }

            if (instruction.equals("pop")) {
                sb.append(pop()).append('\n');
            }

            if (instruction.equals("top")) {
                sb.append(top()).append('\n');
            }

            if (instruction.equals("size")) {
                sb.append(size()).append('\n');
            }

            if (instruction.equals("empty")) {
                sb.append(empty()).append('\n');
            }
        }

        System.out.println(sb);
    }

    public static void push(int data) {
        stack.add(data);
    }

    public static Integer pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    public static Integer top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

}
