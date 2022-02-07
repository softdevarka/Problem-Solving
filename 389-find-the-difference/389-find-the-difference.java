class Solution {
    public char findTheDifference(String s, String t) {
        int arr[]=new int[26];
        for(int i=0;i<t.length();i++) // runs for length of t
        {
            arr[t.charAt(i)-'a']++;
            if(i<s.length())
                arr[s.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++)  //constant time
        {
            if(arr[i]>0)
                return (char)('a'+i);
        }
        
        return 'a';
    }
}