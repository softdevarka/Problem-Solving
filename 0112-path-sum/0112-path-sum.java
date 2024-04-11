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
    boolean helper(TreeNode root, int targetSum, int pathSum){
        if(root == null){
            return false;
        }
        pathSum += root.val;
        if(root.left == null && root.right == null){
            if(pathSum == targetSum){
                return true;
            }
            else{
                return false;
            }
        }
        return helper(root.left, targetSum, pathSum) || helper(root.right, targetSum, pathSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int pathSum = 0;
        return helper(root, targetSum, pathSum);
    }
}