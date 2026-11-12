
class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> duplicateCheck = new HashSet<>();


        for(int number : nums){
            if(!duplicateCheck.add(number)){
                return true;
            }
        }

        return false;

    }
}