class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--) {
            int num = digits[i];
            if(num < 9) {
                digits[i] = num + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int ans[] = new int[n + 1];
        for(int i = 1; i < n + 1; i++) {
            ans[i] = digits[i - 1];
        }
        ans[0] = 1;
        return ans;
    }
        
    }