class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max[] = new int[arr.length];
        int min[] = new int[arr.length];
        
        max[0] = Integer.MIN_VALUE;
        
        for(int i=1; i<arr.length; i++){
            max[i] = Math.max(max[i-1], arr[i-1]);
        }
        
        min[min.length-1] = arr[min.length-1];
        
        for(int i=arr.length-2; i>=0; i--){
            min[i] = Math.min(min[i+1], arr[i]);
        }
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(max[i] <= min[i]) count++;
        }
        return count;
    }
}