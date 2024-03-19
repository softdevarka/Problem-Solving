class Solution {
    public boolean isAnagram(String s, String t) {
            int n = s.length();
            if(s.length() != t.length()){
            return false;}
            int[] count = new int [26];
            for(int i=0; i<n; i++){
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
            }

            for(int i=0; i<count.length; i++){
                if(count[i] != 0) return false;
            }
            return true;

    }
}