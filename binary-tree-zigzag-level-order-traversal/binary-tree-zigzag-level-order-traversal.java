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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // if (root == null) {
        //     return new List<List<Integer>> 
        // }

        List<List<Integer>> answer = new ArrayList<>();

        if (root == null) {
            return answer;
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int currentLen = queue.size();

            List<Integer> segment = new ArrayList<>();

            for (int i = 0; i < currentLen; i++) {
                TreeNode node = queue.remove();

                segment.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

            }

            if (!leftToRight) {
             Collections.reverse(segment);
             answer.add(segment);
        } else {
            answer.add(segment);
        }

            leftToRight = !leftToRight;

    }
    return answer;
}
}