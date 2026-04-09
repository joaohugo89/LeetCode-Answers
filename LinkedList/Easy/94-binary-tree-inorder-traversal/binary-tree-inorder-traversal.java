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
        List<Integer> ret = new ArrayList<>();
        traverse(root, ret);
        return ret;
    }

    private void traverse(TreeNode node, List<Integer> ret) {
        if (node == null) return;

        traverse(node.left, ret);
        ret.add(node.val);
        traverse(node.right, ret);
    }
}