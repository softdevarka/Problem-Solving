class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int[] ans = {-1, -1};
        
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            
            if (nums[mid] < target) {
                lo = mid + 1;
            }
            else if (nums[mid] > target) {
                hi = mid - 1;
            }
            //Found the target element.
            else {
                //Finding it's first occurence(start position).
                int i = mid;
                while (i >= 0 && nums[i] == target) {
                    i--;
                }
                ans[0] = i + 1;
                
                //Finding it's last occurence(end position).
                i = mid;
                while (i < nums.length && nums[i] == target) {
                    i++;
                }
                ans[1] = i - 1;
                
                //After finding, break from the loop, otherwise loop will run indefinitely.
                break;
            }
        }
        
        return ans;
    }
}