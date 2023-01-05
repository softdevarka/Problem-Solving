class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;

        Map<Character, String> hs = new HashMap<Character, String>();

        for(int i=0; i<arr.length; i++){
            char c = pattern.charAt(i);
            String str = arr[i];
            if(hs.containsKey(c)){
                if(!hs.get(c).equals(str))
                return false; 
            }
            else{
                if(hs.containsValue(str)) return false; 
                hs.put(c, str);
            } 
        }
        return true;
    }
}