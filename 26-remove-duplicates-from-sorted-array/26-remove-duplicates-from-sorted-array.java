class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        int pointer = nums[0];
        
        for (int i = 1; i < nums.length; i++){
            
            if (pointer < nums[i]){
            pointer = nums[i];
            nums[k] = pointer;
            k = k + 1;
            }
            
        }
        
        return k;
        
    }
}