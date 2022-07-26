class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }return false;
    }
}

//M 1- take 1 element traverse it whole and check if exists. O(n^2)
// for(int i=0;i<nums.length;i++)
//         {  for(int j=i+1;j<nums.length;j++)
//             { if(nums[i]==nums[j])
//                     return true;
//             }
//         }
// return false;


// M2- sort and check if adjacent elements are repeating 