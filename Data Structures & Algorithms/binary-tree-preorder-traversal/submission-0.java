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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorderResult = new ArrayList<>();
        preorderTraversalHelper(root, preorderResult);
        return preorderResult;
    }

    private static void preorderTraversalHelper(TreeNode root, List<Integer> preorderResult) {
        if (root == null) {
            return;
        }
        preorderResult.add(root.val);
        preorderTraversalHelper(root.left, preorderResult);
        preorderTraversalHelper(root.right, preorderResult);
    }
}