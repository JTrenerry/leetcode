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
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, 0);
    }

    public int sum (TreeNode root, int val) {
        int r = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                r += root.left.val;
            } else {
                r += sum(root.left, val);
            }
        }
        if (root.right != null) {
            if (root.right.left != null || root.right.right != null) {
                r += sum(root.right, val);
            }
        }
        return r;
    }
}
