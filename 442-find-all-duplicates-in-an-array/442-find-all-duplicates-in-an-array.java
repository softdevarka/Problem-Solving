class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
    Set<Integer> hash=new HashSet<Integer>();
for(int i=0;i<nums.length;i++)
{
   if(!hash.add(nums[i]))
    {
     list.add(nums[i]);
   }
}
        return list; 
    }
}