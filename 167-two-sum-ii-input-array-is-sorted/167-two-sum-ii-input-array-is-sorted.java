class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int len = numbers.length;
        
        int res[] = new int[2];
        
        for(int i=0;i<len;i++){
            
            int temp = target-numbers[i];
            
            int index = Arrays.binarySearch(numbers,temp);
            
            if(index >=0){
                
                if(index==i){
                    index++;
                }
               
                res[0] = i+1;
                res[1] = index+1; 
                return res;
            }
        }
        
        return res;
        
    }
}
        
