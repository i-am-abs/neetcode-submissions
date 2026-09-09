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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorderResponse = new ArrayList<>();
        postorderTraversalHelper(root, postorderResponse);
        return postorderResponse;
    }

    private static void postorderTraversalHelper(TreeNode root, List<Integer> postorderResponse) {
        if (root == null) {
            return;
        }
        postorderTraversalHelper(root.left, postorderResponse);
        postorderTraversalHelper(root.right, postorderResponse);
        postorderResponse.add(root.val);
    }
}