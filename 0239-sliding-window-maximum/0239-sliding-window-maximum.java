class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int res[] = new int[n-k+1];
        
        for(int i=0; i<n; i++){
            while(!dq.isEmpty() && i-dq.peekFirst() == k){
                // a window k size complete
                dq.pollFirst();
            }
            
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i >= k-1){
                //we have seen window of size equal to k
                res[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}