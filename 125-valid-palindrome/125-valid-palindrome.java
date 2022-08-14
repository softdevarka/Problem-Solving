class Solution {
    public boolean isPalindrome(String s) {

    	s = s.toLowerCase();
    	s = s.replaceAll("[^a-zA-Z0-9]", "");
    	return isPalindromeRecursive(s, 0, s.length()-1);
    }
    
    public boolean isPalindromeRecursive(String s, int start, int end) {
    	
    	if (start >= end)
    		return true;
    	
    	if (s.charAt(start) != s.charAt(end))
    		return false;
    	
    	return isPalindromeRecursive(s, start+1, end-1);
    	
    }
}