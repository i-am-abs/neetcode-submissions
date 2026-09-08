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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversalHelper(root, inorder);
        return inorder;
    }

    private static void inorderTraversalHelper(TreeNode root, List<Integer> inorder) {
        if (root == null) {
            return;
        }

        inorderTraversalHelper(root.left, inorder);
        inorder.add(root.val);
        inorderTraversalHelper(root.right, inorder);
    }
}