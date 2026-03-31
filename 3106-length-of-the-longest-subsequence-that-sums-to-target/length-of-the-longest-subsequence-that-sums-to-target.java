class Solution {
    public int longest_Sequence(int i , List<Integer> nums , int target , Integer [][] dp ){
        if(target ==0){
            return 0;
        }
        if(i >= nums.size() || target < 0) return  -1;
        if(dp[i][target] != null) return dp[i][target];
        int skip = longest_Sequence(i+1 , nums, target , dp);
        int take = -1;
        int takeResult = longest_Sequence(i+1 , nums, target - nums.get(i) , dp);
        if(takeResult != -1){
            take = 1+ takeResult;
        }
        dp[i][target] = Math.max(skip,take);
        return dp[i][target];
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        Integer [][] dp = new Integer[nums.size()][target+1];
        return longest_Sequence(0,nums,target ,dp);

    }
}