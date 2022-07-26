class Solution {
    public boolean isAnagram(String s, String t) {
         
        if(s.length() != t.length()) //syntax
            return false;
        int[] scounter= new int[26];   //syntax
        int[] tcounter= new int[26];
        
        for(int i=0;i<s.length();i++) //syntax
        {
            scounter[s.charAt(i)-'a']++;  
            tcounter[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(scounter[i]!=tcounter[i])
                return false;
        }
      return true;  
        
    }
}

// M 1- figure out all the permutations of a string , take O(n!) time

// M 2 - sort the 2 strings, acb, bac= abc,abc , true.
//       to convert to string and sort the strings= O(nlogn), space=O(N)
//       to compare the 2 strings= O(N), space=O(1) thus, O(nlog n),O(n)
   // char[] str1=s.toCharArray();  //syntax
   //      char[] str2=t.toCharArray();
   //      Arrays.sort(str1);     //syntax
   //      Arrays.sort(str2);
   //      return Arrays.equals(str1,str2);   //syntax


//M 3- frequency matters - thus take 2 arrays (1-26), using ascii subtraction save the freq at //that loc using counters of each, then compare both- O(n+k),O(k)


// M4 check for more methods in premium




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