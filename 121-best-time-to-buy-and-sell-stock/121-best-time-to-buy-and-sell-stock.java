class Solution {
    public int maxProfit(int[] prices) {
        int largestdiff=0;
        int minsofar=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minsofar)
                minsofar=prices[i];
            else
            {
               largestdiff=Math.max(largestdiff,prices[i]-minsofar);
            }
        }
        return largestdiff;
    }
}

// M 1- iterate through the array take all the next elements as sellingdays and 1st as buyingdays , and check if the profit is ax or not.
//     O(n^2), O(1)

// int largestdiff=0;
//         for(int buyingdays=0;buyingdays<prices.length;buyingdays++)
//         {
//             for(int sellingdays=buyingdays+1;sellingdays<prices.length;sellingdays++)
//             {
//                int currentprofit=prices[sellingdays]-prices[buyingdays]; 
//                 if(currentprofit>largestdiff)
//                 largestdiff=currentprofit;
//             }
//         }
//         return largestdiff;

// M 2- sliding window- one pass approach
// track minsofar, and subtract with the price[i]-keep updating till end of loop. O(n),O(1)