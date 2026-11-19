class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> HM = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int neededNum = target - nums[i];

            if(HM.containsKey(neededNum)){
                return new int[]{HM.get(neededNum), i};
            }

            HM.put(nums[i], i);
        }

        return new int[] {};

    }
}
