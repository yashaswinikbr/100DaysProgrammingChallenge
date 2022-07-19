class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        int temp=n;
        
        
        while(temp>0)
        {
        int d=temp%10;
       
        temp=temp/10;
        
         p=p*d;
         s=s+d;
            
        }
        
        return p-s;
        
        
        
        
    }

}