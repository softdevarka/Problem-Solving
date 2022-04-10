class Solution {
    public int calPoints(String[] ops) {
        int[] record= new int[1000];
        int j=0;
        int sum=0;
        for(int i=0; i<ops.length; i++)
        {
            switch(ops[i])
            {
                case "+":
                    j++;
                    record[j]=record[j-1]+record[j-2];  
                    break;
                
                case "C":
                    record[j]=0;
                    j--;
                    break;
                    
                case "D":
                    j++;
                    record[j]=record[j-1]*2;
                    break;
                
                default:
                    j++;
                    record[j]=Integer.valueOf(ops[i]);
                    break;
            }
        }
        for(int k=0; k<record.length;k++)
        {
            sum+=record[k];
        }
        return sum;
    }
}