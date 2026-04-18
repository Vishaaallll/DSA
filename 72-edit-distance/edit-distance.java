class Solution {
    public static int minDistance_dp(String s1 , String s2 , int i , int j ,int [][] dp){
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = minDistance_dp(s1,s2,i-1,j-1,dp);
        } else {
            int del = minDistance_dp(s1,s2,i-1,j,dp);
            int insert = minDistance_dp(s1,s2,i,j-1,dp);
            int replace = minDistance_dp(s1,s2,i-1,j-1,dp);
            return dp[i][j] = 1+ Math.min(del,Math.min(insert,replace));
        }
    }
    public int minDistance(String s1, String s2) {
        int n = s1.length() , m = s2.length();
        int [][] dp = new int[n][m];
        for(int [] arr : dp) Arrays.fill(arr,-1);
        return minDistance_dp(s1,s2,n-1,m-1,dp);
    }
}