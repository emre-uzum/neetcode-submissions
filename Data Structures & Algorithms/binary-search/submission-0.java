class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int midPoint = low + (high - low) / 2;

            if(nums[midPoint] == target){
                return midPoint;
            }

            if(nums[midPoint] < target){
                low = midPoint + 1;
            }

            if(nums[midPoint] > target){
                high = midPoint - 1;
            }
        }

        return -1;

    }
}
