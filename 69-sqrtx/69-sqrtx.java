class Solution {
    public int mySqrt(int n) {
        int left = 1;
         int Right = n;
         while(left <= Right){
             int mid = left + (Right - left) / 2;

             if((mid ) == n/mid){
                  return mid;
             }
             else if((mid) > n/mid){
                   Right = mid - 1;
             }
             else{
                 left = mid + 1;
             }
         }
        return Right;
    }
}