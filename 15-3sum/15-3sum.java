class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums.length < 3 || nums[0] > 0 || nums[nums.length-1] < 0) 
        return res;
        
        for(int i=0;i<nums.length-2;i++){
           if(nums[i] > 0) break;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
           int target = 0 - nums[i];
           int j =i+1;
           int k =nums.length -1;
            
            while(j<k){
                
                if(nums[j]+nums[k]>target){
                    k--;
                }else if(nums[j]+nums[k]<target){
                    j++;
                }else{
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                    while(j<k && nums[k] ==nums[k+1]){k--;}
                }
            }
        }
        
        return res; 
    }
}