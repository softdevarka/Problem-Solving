class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> n=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
            n.put(nums[i],i);
       
         for(int i=0;i<nums.length;i++)
            if(n.containsKey(target-nums[i])&&n.get(target-nums[i])!=i)
                return new int[] {i,n.get(target-nums[i])} ;
           
        
        return null;
    }
}