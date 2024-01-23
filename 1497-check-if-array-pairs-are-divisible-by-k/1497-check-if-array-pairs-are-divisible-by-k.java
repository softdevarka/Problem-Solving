class Solution {
    public boolean canArrange(int[] arr, int k) {
        int [] freq = new int[k];
        //calculate remainders (arr[i] % k)
        //negative element -> add k to it
        //update element into frequency array
        
        for(int i=0; i<arr.length; i++){
            int rem = arr[i] % k;
            if(rem < 0){
                rem += k;
            }
            freq[rem]++;
        }
        
        if(freq[0] % 2 != 0){ 
            return false;
        }
        
        for(int i=1; i<k; i++){
            if(freq[i] != freq[k-i]){
                return false;
            }
        }
        return true;
    }
}