class Solution {
    public int maxProfit(int[] prices) {

        int leftPointer = 0;
        int rightPointer = 1;

        int maxProfit = 0;

        while(rightPointer < prices.length){
            if(prices[leftPointer] > prices[rightPointer]){
                leftPointer = rightPointer;
            }

            if((prices[rightPointer] - prices[leftPointer] > maxProfit)){
                maxProfit = prices[rightPointer] - prices[leftPointer];
            }
            rightPointer++;


        }

        return maxProfit;


        
    }
}
