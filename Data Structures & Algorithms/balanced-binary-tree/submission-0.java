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
    boolean val = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root, 0);
        return val;
    }

    public int dfs(TreeNode root, int h) {
        if(root == null) return 0;
        int left = dfs(root.left, h);
        int right = dfs(root.right, h);
        if(Math.abs(left - right) >= 2) val = false;

        return 1 + Math.max(left, right);
    }
}
