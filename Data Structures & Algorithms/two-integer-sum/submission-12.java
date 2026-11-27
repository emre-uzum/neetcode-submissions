class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numberIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int numberNeeded = target - nums[i];

            if(numberIndex.containsKey(numberNeeded)){
                return new int[]{numberIndex.get(numberNeeded), i};
            }

            numberIndex.put(nums[i], i);
        }

        return new int[]{};

    }
}
