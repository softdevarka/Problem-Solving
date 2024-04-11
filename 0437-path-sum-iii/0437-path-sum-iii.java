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
    int numsPath[] = new int [1];
    public int pathSum(TreeNode root, int targetSum) {
        List<Long> slate = new ArrayList<>();
        numsPath[0] = 0;
        helper(root, targetSum, slate);
        return numsPath[0];
    }
    public void helper(TreeNode root, long targetSum, List<Long>slate){
        if(root == null){
            return;
        }
        slate.add((long) root.val);
        long suffixSum = 0;
        for(int i=slate.size()-1; i>=0; i--){
            suffixSum += slate.get(i);
            if(suffixSum == targetSum){
                numsPath[0]++;
            }
        }
        helper(root.left, targetSum, new ArrayList<>(slate));
        helper(root.right, targetSum, new ArrayList<>(slate));
    }
}