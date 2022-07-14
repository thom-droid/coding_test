package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TraversalByOrder1991 {

    private static Node[] tree;
    // parent - left - right
    private static void traversePreorder(Node node) {


//        System.out.println(tree[node.value]);
//        traversePreorder(node * 2 + 1);
//        traversePreorder(node * 2 + 2);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Node> map = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String value = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();
            map.put(value, new Node(left, right));
        }


//        tree = new int[]{5, 3, 7, 2, 5, 2, 8};
//        traversePreorder();
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
