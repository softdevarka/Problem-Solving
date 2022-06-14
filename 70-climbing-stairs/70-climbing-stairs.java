class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        
        int nums = 1, previous=0;
        for(int i=0; i<n; i++) {
            int temp = nums;
            nums = previous + nums;
            previous = temp;
        }
        return nums;
    }
}
