// class Solution {
//     public int search(int[] nums, int target) {
//         int low = 0;
//         int high = nums.length - 1;
//         return bSearchRecursive(nums, low, high, target);
//         }
//     public int bSearchRecursive(int nums[], int low, int high, int target){
//         if (low>high)
//             return -1;
//         int mid = (low+high)/2;
//         if (nums[mid] == target)
//             return mid;
//         else if (nums[mid]>target)
//             return bSearchRecursive(nums, low, mid-1, target);
//         else
//             return bSearchRecursive(nums, mid+1, high, target);
//     }
// }

class Solution {
    public int search (int nums[], int target){
        int n = nums.length;
        int low = 0, high = n-1;
        while (low<=high){
            int mid = (low + high) / 2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
            
        }
        return -1;
    }
}