class Solution {
    public int maxProfit(int[] prices) {

        int low = 0;
        int high = 1;

        int maxProfit = 0;

        while(high < prices.length){
            if(prices[low] > prices[high]){
                low = high;
            }

            if((prices[high] - prices[low]) > maxProfit ){
                maxProfit = prices[high] - prices[low];
            }

            high++;
        }

        return maxProfit;
     
    }
}
