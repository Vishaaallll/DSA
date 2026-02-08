class Solution {
    public int amount(int [] nums, int idx , int n , int [] dp){
        if(idx >= n) return 0;
        if(dp[idx] != -1) return dp[idx];
        int take = nums[idx] + amount(nums ,idx+2 , n ,dp);
        int skip = amount(nums,idx+1 , n , dp);
        dp[idx] = Math.max(take, skip);
        return dp[idx];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp ,-1);
        return amount(nums,0,n,dp);
    }
}