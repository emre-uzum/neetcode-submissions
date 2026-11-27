class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int numNeeded = target - nums[i];

            if(numIndex.containsKey(numNeeded)){
                return new int[]{numIndex.get(numNeeded), i};
            }

            numIndex.put(nums[i], i);
        }
        
        return new int[]{};
    }
}
