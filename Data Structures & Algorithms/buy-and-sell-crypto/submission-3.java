class Solution {
    public int maxProfit(int[] prices) {

        int leftPointer = 0;
        int rightPointer = 1;

        int maxProfit = 0;

        while(rightPointer < prices.length){
            if(prices[leftPointer] > prices[rightPointer]){
                leftPointer = rightPointer;
            }
            else{
                if( (prices[rightPointer] - prices[leftPointer]) > maxProfit){
                    maxProfit = prices[rightPointer] - prices[leftPointer];
                    System.out.println(maxProfit);
                }

            }
            rightPointer++;
        }

        return maxProfit;
        
    }
}
