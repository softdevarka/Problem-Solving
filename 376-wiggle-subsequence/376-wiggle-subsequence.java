class Solution {
    public int wiggleMaxLength(int[] nums) {
      int size = nums.length, up = 1, down = 1;
      if(size <= 1) return size;
        for(int i = 1; i < size; i ++){
                 if(nums[i] > nums[i - 1]) up = down + 1;
            else if(nums[i] < nums[i - 1]) down = up + 1;
        }
        return Math.max(up, down);  
    }
}