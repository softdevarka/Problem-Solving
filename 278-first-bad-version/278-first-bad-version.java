/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            
            if (!isBadVersion(midpoint)) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return left;
    }

}