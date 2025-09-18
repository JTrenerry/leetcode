/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode n1 = new TreeNode(val, root, null);
            return n1;
        }
        return add(root, val, depth, 1);
    }

    public TreeNode add(TreeNode root, int val, int depth, int cur) {
        if (depth == cur + 1) {
            TreeNode n1 = new TreeNode(val, root.left, null);
            root.left = n1;
            TreeNode n2 = new TreeNode(val, null, root.right);
            root.right = n2;

            return root;
        }

        if (root.left != null) {
            add(root.left, val, depth, cur + 1);
        }
        if (root.right != null) {
            add(root.right, val, depth, cur + 1);
        }
        return root;
    }
}
