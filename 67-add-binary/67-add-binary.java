class Solution {
    public String addBinary(String a, String b) {
        String result ="";
        int lena= a.length();
        int lenb= b.length();
        int i=0;
        int carry =0;
        while(i<lena|| i<lenb || carry!=0){
            int ival =0;
            int jval=0;
            if(i<lena  && a.charAt(lena-1-i)=='1') ival = 1;
            
            if(i<lenb  && b.charAt(lenb-1-i)=='1') jval = 1;
            
            int sum = carry+ ival+jval;
            result = (sum%2)+result;
            carry = sum/2;
            i++;
            
        }
        
        return result;
        
    }
}