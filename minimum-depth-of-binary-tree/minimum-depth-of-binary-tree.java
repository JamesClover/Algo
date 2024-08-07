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
    public int minDepth(TreeNode root) {
        return dfs(root);
    }
    
    private int dfs(TreeNode node) {
        
        if (node == null) {
            return 0;
        }
        
        if (node.left == null) {
            return 1 + dfs(node.right);
        } else if (node.right == null) {
            return 1 + dfs(node.left);
        }
        
        return Math.min(dfs(node.left), dfs(node.right)) + 1;
    };
}