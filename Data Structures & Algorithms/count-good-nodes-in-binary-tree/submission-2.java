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

    public int goodNodes(TreeNode root) {
        if(root == null) return 0;

        dfs(root, root.val);

        return c;
    }

    public void dfs(TreeNode root, int max) {
        if(root == null) return;
        if(root.val >= max) c++;
        dfs(root.left, Math.max(root.val, max));
        dfs(root.right, Math.max(root.val, max));

    }
}
