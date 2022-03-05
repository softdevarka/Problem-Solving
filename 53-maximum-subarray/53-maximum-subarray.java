class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int maxEnd = nums[0];
        for(int i=1; i<n; i++){
            maxEnd = Math.max(maxEnd+nums[i],nums[i]);
            res = Math.max(res,maxEnd);
        }
        return res;
    }
}