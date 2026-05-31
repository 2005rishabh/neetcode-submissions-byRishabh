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
    int c = 0;
    public int maxDepth(TreeNode root) {
        
        return dfs(root, c);
    }

    public int dfs(TreeNode root, int c) {
        if(root == null) return 0;
        return 1 + Math.max(dfs(root.left, c), dfs(root.right, c));
    }
}
