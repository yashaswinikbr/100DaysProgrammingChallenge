class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1=s.toCharArray();  //syntax
        char[] str2=t.toCharArray();
        Arrays.sort(str1);     //syntax
        Arrays.sort(str2);
        
        return Arrays.equals(str1,str2);   //syntax
        
        
    }
}

// M 1- figure out all the permutations of a string , take O(n!) time
// M 2 - sort the 2 strings, acb, bac= abc,abc , true.
//       to convert to string and sort the strings= O(nlogn), space=O(N)
//       to compare the 2 strings= O(N), space=O(1)





// HashMap <String, Integer> h=new HashMap<>();
//         for(int i=0;i<s.length();i++)
//         {
//             h.put(s.charAt(i),0);
//         }
//         for(int i=0;i<t.length();i++)
//         {
//             if(h.containsKey(t.charAt(i)))
//                 return true;
            
//         }
//         return false;