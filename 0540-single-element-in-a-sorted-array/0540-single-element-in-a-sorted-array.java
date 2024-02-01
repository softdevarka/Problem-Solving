class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        //1st element
        if(nums[0] != nums[1]) return nums[0];
        //last element
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int l = 1, r = n-2;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                return nums[mid];
            
            if((mid%2 == 1 && nums[mid] == nums[mid-1]) || 
               (mid%2 == 0 && nums[mid] == nums[mid+1])){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return -1;
    }
}


// class Solution {
// public:
//     int singleNonDuplicate(vector<int>& nums) {
//         int n = nums.size();
//         if(n == 1) return nums[0];
//         //1st element
//         if(nums[0] != nums[1]) return nums[0];
//         //last element
//          if(nums[n-1] != nums[n-2]) return nums[n-1];
//         int l = 1, h = n-2;
//         while(l <= h){
//             int mid = (l + h)/2;
//             if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
//             return nums[mid];

//             // even-odd -> move right
//             if((mid%2 == 1 && nums[mid] == nums[mid-1]) || 
//             (mid%2 == 0 && nums[mid] == nums[mid+1]) ){
//                 l = mid + 1;
//             }

//             else{
//                 h = mid-1;
//             }
//         }
//         return -1;
//     }
// };