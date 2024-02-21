package algo.binary_tree;

public class TreeTraversal {

    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 7, 2, 5, 2, 8};
        inorderTreeWalk(data, 0);
    }
    private static void inorderTreeWalk(int[] data, int index) {
        if ( index >= data.length ) {
            return ;
        }

        inorderTreeWalk(data, 2 * index + 1);
        System.out.println(data[index]);
        inorderTreeWalk(data, 2 * index + 2);
    }
}
