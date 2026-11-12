class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> HM = new HashMap<>();
       
        for(int i = 0; i < nums.length; i++){

            int numNeeded = target - nums[i];
            if(HM.containsKey(numNeeded)){
                return new int[]{HM.get(numNeeded), i};
            }

            HM.put(nums[i], i);


        }

        return new int[]{};


    }
}
