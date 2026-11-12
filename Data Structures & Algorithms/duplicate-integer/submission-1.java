
class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> appearedNums = new HashSet<>();
        for(int num : nums){
            if(appearedNums.contains(num)){
                return true;
            }
            appearedNums.add(num);
        }

        return false;
        
    }
}