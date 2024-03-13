class Solution {
    public int trap(int[] height) {
        int lmax[] = new int[height.length];
        int rmax[] = new int[height.length];
        
        lmax[0] = height[0];
        
        for(int i=1; i<lmax.length; i++){
            lmax[i] = Math.max(lmax[i-1], height[i]);
        }
        
        rmax[rmax.length-1] = height[height.length-1];
        
        for(int i=rmax.length-2; i>=0; i--){
            rmax[i] = Math.max(rmax[i+1], height[i]);
        }
        
        int ans = 0;
        for(int i=0; i<height.length; i++){
            int allowed = (Math.min(lmax[i], rmax[i]) - height[i]);
            ans += allowed;
        }
        return ans;
    }
}