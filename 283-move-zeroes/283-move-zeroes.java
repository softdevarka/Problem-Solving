class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i=0; i<n; i++){
            if (nums[i] != 0){
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count ++;
            }
        }
    }
}