class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int n,m;
        n=nums.length;
        m=n+n;
        int [] ne = new int[m];
        System.arraycopy(nums,0,ne,0,n);
        System.arraycopy(nums,0,ne,n,n);
        return ne;
    }
}