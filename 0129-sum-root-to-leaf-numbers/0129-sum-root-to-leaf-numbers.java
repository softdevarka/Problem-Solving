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
    int rootToLeaf = 0;
    void helper(TreeNode root, int currentNumber){
        if(root == null){
            return;
        }
        currentNumber = currentNumber*10 + root.val;
        if(root.left == null && root.right == null) {
            rootToLeaf += currentNumber;
        }
        helper(root.left, currentNumber);
        helper(root.right, currentNumber);
    }
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return rootToLeaf;
    }
}