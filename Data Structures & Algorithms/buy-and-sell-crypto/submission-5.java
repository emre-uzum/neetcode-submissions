class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        int leftPointer = 0;
        int rightPointer = 1;

        while(rightPointer < prices.length){
            if(prices[leftPointer] > prices[rightPointer]){
                leftPointer = rightPointer;
            }
            else{
                if((prices[rightPointer] - prices[leftPointer]) > maxProfit){
                    maxProfit = prices[rightPointer] - prices[leftPointer];
                }
            }
            rightPointer++;

        }

        return maxProfit;



        
    }
}
