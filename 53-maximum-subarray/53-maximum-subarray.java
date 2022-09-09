class Solution {
    public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int res = nums[0];
//         int maxEnd = nums[0];
//         for(int i=1; i<n; i++){
//             maxEnd = Math.max(maxEnd+nums[i],nums[i]);
//             res = Math.max(res,maxEnd);
//         }
//         return res;
//     }
// }

int sum = 0;
        int maximum = nums[0];
        for (int i=0; i<nums.length; i++){
         sum += nums[i];
            if(sum > maximum)
                maximum = sum;
            if(sum < 0)
                sum = 0;
        }
        return maximum;
    }
}