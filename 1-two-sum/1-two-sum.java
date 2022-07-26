class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer,Integer> h= new HashMap<>();
       // int[] result = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            
            int comp=target-nums[i];
          //  result[1] = i;
          //  result[0] = map.get(target - numbers[i]);
            if(h.containsKey(comp))
                return new int[] {h.get(comp),i};
            h.put(nums[i],i);
            
        }
       
        return new int[] {0,0};
       // return result;
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


//M2 - Hash map, check if the complement exists in the map or not O(n)