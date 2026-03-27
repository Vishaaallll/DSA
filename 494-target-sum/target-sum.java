class Solution {
    public int NumberOfWays(int i, int target , int [] nums){
        if(i == nums.length){
            if(target == 0) return 1;
            else return 0;
        }
        int add = NumberOfWays(i+1, target-nums[i], nums);
        int sub = NumberOfWays(i+1, target + nums[i], nums);
        return add+ sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return NumberOfWays(0,target, nums);
    }
}