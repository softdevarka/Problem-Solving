class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int temp = x;
        while(temp != 0){
            int lastDigits = temp % 10;
            rev = rev * 10 + lastDigits;
            temp = temp/10;
        }
        // if(rev == x) {
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return (rev == x);
    }
}