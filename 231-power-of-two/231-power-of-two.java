class Solution {
    public boolean isPowerOfTwo(int n) {
      
        long a= (int)n;
       if(a==0)
           return false;
        if((a & (-a))==a)
            return true;
        else
            return false;
    }
}