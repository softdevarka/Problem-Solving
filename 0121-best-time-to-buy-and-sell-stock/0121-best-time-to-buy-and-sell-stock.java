class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(arr[i] - minPrice, maxPro);
        }
        return maxPro;
        
    }
}