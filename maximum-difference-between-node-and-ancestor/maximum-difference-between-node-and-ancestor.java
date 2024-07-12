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
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);   
    }
    
    private int dfs(TreeNode node, int maxVal, int minVal) {
        // iterate through trees on both left and right.
        // find highest and lowest values, keep track of those values
        // return abs value of those values
        
        if (node == null) {
            return maxVal - minVal;
        }
    
        maxVal = Math.max(node.val, maxVal);
        minVal = Math.min(node.val, minVal);
        
        int left = dfs(node.left, maxVal, minVal);
        int right = dfs(node.right, maxVal, minVal);
        
        return Math.max(left, right);
            
        }
        
        
}