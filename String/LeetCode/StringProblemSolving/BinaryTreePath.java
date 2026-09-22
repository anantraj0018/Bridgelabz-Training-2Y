import java.util.*;

public class BinaryTreePaths {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static void findPaths(TreeNode root, String path) {
        if (root == null) {
            return;
        }

        path = path + root.val;

        if (root.left == null && root.right == null) {
            System.out.println(path);
            return;
        }

        path = path + "->";

        findPaths(root.left, path);
        findPaths(root.right, path);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of nodes
        int n = sc.nextInt();

        TreeNode[] nodes = new TreeNode[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new TreeNode(sc.nextInt());
        }

        // Enter left and right child index
        for (int i = 0; i < n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left != -1) {
                nodes[i].left = nodes[left];
            }

            if (right != -1) {
                nodes[i].right = nodes[right];
            }
        }

        findPaths(nodes[0], "");
    }
}