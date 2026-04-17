class Solution {

    public int LPS_dp(String s , int i , int j ,int [][] dp){
if(i > j) return 0;
        if(i==j) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = 2 + LPS_dp(s,i+1,j-1,dp);
        } else {
            return dp[i][j] = Math.max(LPS_dp(s,i+1,j,dp) , LPS_dp(s,i,j-1,dp));
        }
    }
    public int longestPalindromeSubseq(String s) {
        if(s.length() <= 1) return s.length();
        int [][] dp = new int[s.length()][s.length()];
        for(int [] nums : dp){
            Arrays.fill(nums,-1);
        }
        return LPS_dp(s ,0,s.length()-1,dp);
    }
}