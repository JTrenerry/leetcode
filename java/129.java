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
    public int sumNumbers(TreeNode root) {
        return sum(root, root.val);
    }

    public int sum(TreeNode root, int v) {
        if (root == null) {
            return v;
        }
        int l = 0;
        int r = 0;
        if (root.left != null) {
            l = v * 10 + root.left.val;
            l = sum(root.left, l);
        }
        if (root.right != null) {
            r = v * 10 + root.right.val;
            r = sum(root.right, r);
        }
        int k = v;
        if (l + r != 0) {
            k = l + r;
        }
        return k;
    }
}
