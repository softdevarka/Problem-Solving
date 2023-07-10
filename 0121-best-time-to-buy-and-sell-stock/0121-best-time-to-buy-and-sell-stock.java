class Solution {
    public int maxProfit(int[] arr) {
       int maxPro = 0;
       int minPrice = Integer.MAX_VALUE;
       int n = arr.length;
       for(int i=0; i<n; i++){
           minPrice = Math.min(minPrice, arr[i]);
           maxPro = Math.max(maxPro, arr[i] - minPrice);
       }
       return maxPro;
    }
}