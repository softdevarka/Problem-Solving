/*class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int res = 0;
        int count = 1;
        for (int i=1; i<n; i++){
            if (nums[res]==nums[i])
                count++;
            
        }
        else{
            count--
        }
    }
} */ 
// gfg sandeep sir solution

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        
        for(int i=0; i<nums.length; i++){
            if(count == 0) {
                element = nums[i];
            }
            if (nums[i]==element)
                count += 1;
            else count -= 1;
        }
        return element;
    }
}
// striver soln