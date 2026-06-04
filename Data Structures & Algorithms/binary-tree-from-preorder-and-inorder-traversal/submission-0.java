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
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        TreeNode root = fun(preorder, 0, preorder.length -1, inorder, 0, inorder.length - 1);
        return root;
    }

    public TreeNode fun(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if(ps > pe || is > ie) return null;

        TreeNode root = new TreeNode(preorder[ps]);

        int i = map.get(root.val);
        int numsLeft = i - is;


        root.left = fun(preorder, ps+1, ps + numsLeft, inorder, is, i);
        root.right = fun(preorder, ps+numsLeft + 1, pe, inorder, i + 1, ie); 

        return root;
    }
}
