class Solution {
    public boolean isPalindrome(String s) {


        char[] sArray = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        int leftPointer = 0;
        int rightPointer = sArray.length - 1;
        while(leftPointer < rightPointer){
            if(sArray[leftPointer] == sArray[rightPointer]){
                leftPointer ++;
                rightPointer --;
            }
            else{
                return false;
            }
            
        }


     

        return true;

    }
}
