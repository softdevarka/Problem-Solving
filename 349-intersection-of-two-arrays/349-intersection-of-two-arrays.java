class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        
        int[] ans=new int[set.size()];
        int j=0;
        for(Integer i: set){
            ans[j]=i;
            j++;
        }
        
        return ans;
    }
}