
class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> appearedNums = new HashSet<>();
        for(int num : nums){
            if(!appearedNums.add(num)){
                return true;
            }
        }

        return false;
        
    }
}