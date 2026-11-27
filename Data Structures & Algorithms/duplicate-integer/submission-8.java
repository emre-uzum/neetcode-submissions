
class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> HS = new HashSet<>();

        for(int number : nums){
            if(HS.contains(number)){
                return true;
            }
            HS.add(number);
        }

        return false;


    }
}