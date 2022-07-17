class Solution {
    public boolean isPalindrome(int x) {
        int n=0,r;
        int t=x;
        if(x<0)
            return false;
        else
            while(x!=0)
            {
                r=x%10;
                n=n*10+r;
                x=x/10;
                
            }
      if(t==n)
          return true;
        else
            return false;
    }
   
}
