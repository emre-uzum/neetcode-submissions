class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> HM = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int numberNeeded = target - nums[i];

            if(HM.containsKey(numberNeeded)){
                return new int[]{HM.get(numberNeeded),i};
            }

            HM.put(nums[i], i);
        }

        return new int[]{};



    }
}
