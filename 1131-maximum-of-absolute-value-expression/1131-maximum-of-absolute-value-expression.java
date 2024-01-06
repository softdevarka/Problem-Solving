class Solution {
    public int maxAbsValExpr(int[] x, int[] y) {
        int max1 = Integer.MIN_VALUE; //-2 ^ 63
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE; //(2 ^63) -1
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int min4 = Integer.MAX_VALUE;
        
        for(int i=0; i<x.length; i++){
            max1 = Math.max(max1, (x[i] + y[i] + i));
            min1 = Math.min(min1, (x[i] + y[i] + i));
            
            max2 = Math.max(max2, (-x[i] + y[i] + i));
            min2 = Math.min(min2, (-x[i] + y[i] + i));
            
            max3 = Math.max(max3, (x[i] - y[i] + i));
            min3 = Math.min(min3, (x[i] - y[i] + i));
            
            max4 = Math.max(max4, (-x[i] - y[i] + i));
            min4 = Math.min(min4, (-x[i] - y[i] + i));
        }
        
        return Math.max(Math.max(max1 - min1, max2 - min2), 
                        Math.max(max3 - min3, max4 - min4));
    }
}