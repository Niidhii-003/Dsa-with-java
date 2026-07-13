import java.util.*;

public class bottomView {

    // Tree Node
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // Pair class
    static class Pair {
        TreeNode node;
        int x; // Horizontal Distance

        Pair(TreeNode node, int x) {
            this.node = node;
            this.x = x;
        }
    }

    // Function to find Bottom View
    static ArrayList<Integer> bottomView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        TreeMap<Integer, Integer> mp = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair p = q.remove();

            TreeNode curr = p.node;
            int x = p.x;

            // Overwrite previous value at same horizontal distance
            mp.put(x, curr.val);

            if (curr.left != null) {
                q.add(new Pair(curr.left, x - 1));
            }

            if (curr.right != null) {
                q.add(new Pair(curr.right, x + 1));
            }
        }

        for (int val : mp.values()) {
            ans.add(val);
        }

        return ans;
    }

    public static void main(String[] args) {

        /*
                  20
                /    \
               8      22
             /  \       \
            5    3       25
                / \
               10 14

        Bottom View = [5, 10, 3, 14, 25]
        */

        TreeNode root = new TreeNode(20);

        root.left = new TreeNode(8);
        root.right = new TreeNode(22);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(25);

        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        ArrayList<Integer> ans = bottomView(root);

        System.out.println("Bottom View:");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}