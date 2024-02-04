class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = first_position(nums,target);
        ans[1] = last_position(nums,target);
        
        return ans;
    }
    
    public static int first_position(int nums[], int target){
        int n = nums.length;
        int fp = -1;
        int l = 0;
        int r = n-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                fp = mid;
                r = mid-1;
            }
            else if(nums[mid] < target){
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return fp;
    }
    
    public static int last_position(int nums[], int target){
        int n = nums.length;
        int lp = -1;
        int l =0;
        int r = n-1;
        
        while(l<=r) {
            int mid = (l+r)/2;
            if(nums[mid] == target){
                lp = mid;
                l = mid+1;
            }
            else if(nums[mid] <target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return lp;
    }
}