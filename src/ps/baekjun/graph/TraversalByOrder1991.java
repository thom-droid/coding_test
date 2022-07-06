package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TraversalByOrder1991 {

    private static Node[] tree;
    // parent - left - right
    private static void traversePreorder(Node node) {

        if (node.value == null) {
            return;
        }

//        System.out.println(tree[node.value]);
//        traversePreorder(node * 2 + 1);
//        traversePreorder(node * 2 + 2);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Node> nodeArrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] nodes = br.readLine().split(" ");

        }


//        tree = new int[]{5, 3, 7, 2, 5, 2, 8};
//        traversePreorder();
    }

    private static class Node {
        String value;
        Node left;
        Node right;

        public Node(String value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }


}
