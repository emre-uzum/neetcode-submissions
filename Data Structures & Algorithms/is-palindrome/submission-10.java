class Solution {
    public boolean isPalindrome(String s) {

        String formattedS = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int leftPointer = 0;
        int rightPointer = formattedS.length() - 1;

        while(leftPointer < rightPointer){
            if(formattedS.charAt(leftPointer) != formattedS.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;




    }
}
