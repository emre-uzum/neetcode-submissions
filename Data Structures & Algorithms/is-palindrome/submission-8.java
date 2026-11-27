class Solution {
    public boolean isPalindrome(String s) {

        String sFormatted = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int leftPointer = 0;
        int rightPointer = sFormatted.length() - 1;

        while(leftPointer < rightPointer){
            if(sFormatted.charAt(leftPointer) != sFormatted.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;

        



    }
}
