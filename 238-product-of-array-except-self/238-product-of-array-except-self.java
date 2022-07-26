class Solution {
    public int[] productExceptSelf(int[] nums) {
          int answer[]=new int[nums.length];
          int L[]=new int[nums.length];
          int R[]=new int[nums.length];
        L[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            L[i]=L[i-1]*nums[i-1];
        }
        R[nums.length-1]=1;
         for(int i=nums.length-2;i>=0;i--)
        {
            R[i]=R[i+1]*nums[i+1];
        }
         for(int i=0;i<nums.length;i++)
         {
             answer[i]=L[i]*R[i];
         }
    return answer;
    }
}

//M-1  multiply all elements of nums[] and divide by nums[i] while displaying 
// O(n^2) 2 for loops run
// WRONG APPROACH- as if the divided no. is 0 wont work

// int prod=1;
//           int[] answer = new int[nums.length];  
//     for(int i=0;i<nums.length;i++)
//     {prod=prod*nums[i];}
//     for(int i=0;i<nums.length;i++)
//        { if(nums[i]==0)
//             answer[i]=prod;
//         else
//         answer[i]=prod/nums[i];}
//         return answer;


// M2 use L[] , R[] to store the PrefixProduct and suffixprod of the nums[i]
//O(n),space-O(n)
   