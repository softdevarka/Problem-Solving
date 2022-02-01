class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minvalue = Integer.MAX_VALUE;
        int profit = 0;
        for (int i=0; i<n; i++){
            if (prices[i] < minvalue)
                minvalue = prices[i];
            else if (prices[i]-minvalue > profit)
                profit = prices[i]-minvalue;
        }
        return profit;
    }
}