class Solution {
    public int helper(int idx ,  int [] cost , int[] dp){
        if(idx == 0|| idx == 1){
            return cost[idx];
        } 
        if(dp[idx] != -1){
            return dp[idx];
        }
        return dp [idx] = cost[idx] + Math.min(helper(idx -1 ,  cost ,dp) , helper(idx-2 ,cost,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int[n];
        Arrays.fill(dp ,-1);
        return  Math.min(helper(n-1 ,  cost , dp) , helper(n-2 ,cost ,dp));
    }
}