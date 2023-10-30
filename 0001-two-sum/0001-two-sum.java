// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for (int i=0; i<n; i++){
//             for (int j=i+1; j<n; j++){
//                 if (nums[i]+nums[j]==target)
//                     return new int[] {i,j};
//             }
//         }
//         return null;
//     }
// }
    

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> hash=new HashMap<>();
        int res[]= new int[2];
        
        for(int i=0; i< nums.length;i++)
        {
            if(hash.containsKey(target-nums[i]))
            {
                
                res[0]=hash.get(target-nums[i]);
                res[1]=i;
                return res;
            }
            else
            {
                hash.put(nums[i],i);
            }
        }
        return res;
    }
}