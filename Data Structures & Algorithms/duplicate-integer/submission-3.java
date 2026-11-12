
class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> duplicateCheck = new HashSet<>();


        for(int number : nums){
            if(duplicateCheck.contains(number)){
                return true;
            }

            duplicateCheck.add(number);
        }

        return false;

    }
}