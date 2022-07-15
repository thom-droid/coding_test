package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TraversalByOrder1991 {

    private static Map<String, Node> tree;
    private static StringBuilder sb;
    // parent - left - right
    private static void traversePreorder(String value) {

        if (value.equals(".")) {
            return;
        }

        sb.append(value);
        traversePreorder(tree.get(value).left);
        traversePreorder(tree.get(value).right);
    }

    private static void traverseInorder(String value) {

        if (value.equals(".")) {
            return;
        }

        traverseInorder(tree.get(value).left);
        sb.append(value);
        traverseInorder(tree.get(value).right);
    }

    private static void traversePostorder(String value) {

        if (value.equals(".")) {
            return;
        }

        traversePostorder(tree.get(value).left);
        traversePostorder(tree.get(value).right);
        sb.append(value);
    }

    public static void main(String[] args) throws IOException {

        sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        tree = new HashMap<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String value = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();
            tree.put(value, new Node(left, right));
        }

        traversePreorder("A");
        sb.append('\n');
        traverseInorder("A");
        sb.append('\n');
        traversePostorder("A");

        System.out.println(sb);
    }

    private static class Node {
        String left;
        String right;

        public Node(String left, String right) {
            this.left = left;
            this.right = right;
        }
    }


}
