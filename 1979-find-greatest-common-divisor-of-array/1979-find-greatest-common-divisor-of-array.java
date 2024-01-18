class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        
        int dividend = nums[0];
        int divisor = nums[nums.length-1];
        
        int rem = dividend % divisor;
        
        while(rem > 0){
            dividend = divisor;
            divisor = rem;
            rem = dividend % divisor;
        }
        return divisor;
    }
}