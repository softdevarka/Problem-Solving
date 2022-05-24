class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        if(needle.equals("")){
            return 0;
        }
        else{
            for(int i = 0; i<haystack.length(); i++){
                if(i+needleLength > haystack.length()){
                    return -1;
                }
                String substring = haystack.substring(i, i+needleLength);
                if(substring.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}