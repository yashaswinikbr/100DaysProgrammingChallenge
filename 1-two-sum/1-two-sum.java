class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer,Integer> h= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            
            int comp=target-nums[i];
            if(h.containsKey(comp))
                return new int[] {h.get(comp),i};
            h.put(nums[i],i);
            
        }
       
        return new int[] {0,0};
    }
    
}


// M1- traverse all the elements - O(n^2)
//      for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(target==nums[i]+nums[j])
//                 {   
//                    return new int[] { i, j };
//                 }
                
//             }
//         }
//         return null;