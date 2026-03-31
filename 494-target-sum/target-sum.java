class Solution {
    int sum = 0;
    public int NumberOfWays(int i, int target ,int res , int [] nums , int [][] dp){
        if(i == nums.length){
            if(res == target) return 1;
            else return 0;
        }
        if(dp[i][res+sum] != -1) return dp[i][res+sum];
        int add = NumberOfWays(i+1, target, res - nums[i], nums,dp);
        int sub = NumberOfWays(i+1, target, res + nums[i], nums,dp);
        return dp[i][res +sum] = add + sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        sum = 0;
        for(int num : nums) sum += num;
        int [][] dp = new int [nums.length][2*sum+1];
        for(int [] arr : dp) Arrays.fill(arr,-1);
        return NumberOfWays(0,target,0, nums ,dp);
    }
}