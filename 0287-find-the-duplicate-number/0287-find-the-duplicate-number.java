class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                res = nums[i];
            }
        }
        return res;
    }
}