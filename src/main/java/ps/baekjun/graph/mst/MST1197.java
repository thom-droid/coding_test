package ps.baekjun.graph.mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MST1197 {

    private static int V;
    private static int E;
    private static int[][] vertices;
    private static int[] parent;
    private static int[] elementsOfSet;

    //Kruskal's algorithm

    public static int kruskal() {

        int minWeight = 0;

        for (int i = 1; i < vertices.length; i++) {
            int vertex = vertices[i][0];
            int adjacent = vertices[i][1];
            int weight = vertices[i][2];

            if (!hasSameRoot(vertex, adjacent)) {
                unionSet(vertex, adjacent);
                minWeight += weight;
            }
        }

        return minWeight;
    }

    private static boolean hasSameRoot(int vertex, int adjacent) {
        return findSet(vertex) == findSet(adjacent);
    }

    // O (lg n)
    private static int findSet(int vertex) {
        if(vertex != parent[vertex])
            vertex = findSet(parent[vertex]);
        return parent[vertex];
    }

    // O
    private static void unionSet(int vertex, int adjacent) {
        int x = findSet(vertex);
        int y = findSet(adjacent);
        int sizeX = elementsOfSet[x];
        int sizeY = elementsOfSet[y];

        if (sizeX > sizeY) {
            parent[y] = x;
            elementsOfSet[x] += sizeY;
        } else {
            parent[x] = y;
            elementsOfSet[y] += sizeX;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        V = Integer.parseInt(input[0]) + 1; // n
        E = Integer.parseInt(input[1]) + 1; // m

        vertices = new int[E][3]; // [v, e, w]
        vertices[0] = new int[]{0, 0, Integer.MIN_VALUE}; // zero index will not be used

        // O(n)
        for (int v = 1; v < E; v++) {
            vertices[v] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        parent = new int[V];
        elementsOfSet = new int[V];

        // O(n)
        Arrays.fill(elementsOfSet, 1);

        // O(n)
        for (int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }

        // tim sort, O(n log n)
        Arrays.sort(vertices, Comparator.comparingInt(o -> o[2]));

        int result = kruskal();
        System.out.println(result);

        // m(edges) is more likely to be larger than n(vertices),
        // conclusively O (m log n)
    }


}
