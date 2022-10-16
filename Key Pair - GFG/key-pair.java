//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().hasArrayTwoCandidates(arr, n, x);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        
        Arrays.sort(arr);
        // for(int i=0;i<n;i++)
        // {
        //     int y=x-arr[i];
        //     int low=i+1;
        //     int high=n-1;
        //     while(low<=high)
        //     {
                
        //         int mid=(low+high)/2;
        //         if(arr[mid]==y) return true;
        //         else if(arr[mid]<y) low=mid+1;
        //         else high=mid-1;
        //     }
            
        // }
    //     for( int i=0;i<n;i++)
    //     {
    //         for(int j=n-1;j>1;j--)
    //         {
    //             if(arr[i]+arr[j]==x) return true;
    //         }
    //     }
    //     return false;
    // }
         int i,findElement;
        HashMap<Integer,Integer> map = new HashMap<>();
       
        for( i=0;i<n;i++){
            findElement = x-arr[i];
            if(map.containsKey(findElement)){
                return true;
            }else{
                map.put(arr[i],i);
            }
        }
         return false;
        //  for(int i=0;i<n;i++)  //M1
        //  {
        //      for(int j=0;j<n;j++)
        //      {
        //          if(i!=j && arr[i]+arr[j]==x)
        //           return true;
        //      }
        //  }
        
    } 
}