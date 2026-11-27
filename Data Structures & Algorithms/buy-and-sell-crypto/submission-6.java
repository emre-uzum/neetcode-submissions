class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int leftPointer = 0;
        int rightPointer = 1;

        while(rightPointer < prices.length){
            if(prices[leftPointer] > prices[rightPointer]){
                leftPointer = rightPointer;
            }

            int difference = prices[rightPointer] - prices[leftPointer];

            if(difference > maxProfit){
                maxProfit = difference;
            }

            rightPointer ++;
        }

        return maxProfit;
        
    }
}
