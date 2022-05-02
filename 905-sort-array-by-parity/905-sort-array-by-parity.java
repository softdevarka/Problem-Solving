class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int j = 0;
      for(int i = 0; i < nums.length; i ++)
        if(nums[i] % 2 == 0)
        {                                      // Swap position of nums[i] and nums[j]
          int t = nums[i];
          nums[i] = nums[j];
          nums[j] = t;
          j ++;
        }
      return nums;
    }
}