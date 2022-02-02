class Solution {
    int[] sMap, pMap;
    public boolean checkValid() {
        for(int i=0;i<26;i++)
            if(sMap[i]!=pMap[i]) return false;         
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        int start = 0, end = 0 , k = p.length();
        sMap = new int[26];
        pMap = new int[26];
        for (char c : p.toCharArray()) pMap[c-'a']++;
        while (end < s.length()) {
            char curr = s.charAt(end);
            sMap[curr-'a']++;
            if (end - start + 1 < k) {
                end++;
            } else {
                if (checkValid()) pos.add(start);
                sMap[s.charAt(start) - 'a']--;
                start++;
                end++;
            }
        }
        return pos;
    }
}
