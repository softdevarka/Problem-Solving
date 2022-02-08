class Solution {
    
    public int sum (int p)
{
    int s=0;
    do{
        int a=p%10;
        s=s+a;
        p=p/10;
    } while (p!=0);
    return s;
}

public int digit(int n){
    if (n>9){
        return digit (sum(n));
    }
    else 
        return n;
}
    
    public int addDigits(int num) {
    return digit(num);
        
    }
}

