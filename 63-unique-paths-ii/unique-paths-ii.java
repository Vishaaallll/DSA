class Solution {
    public int helper(int[][] obstacleGrid, int i , int j , int n , int m , int [][]dp){
        if(i >= n || j >= m || obstacleGrid[i][j] == 1) return 0;
        if(i == n-1 && j == m-1) return 1;
        if(dp[i][j] != -1 ) return dp[i][j];
        int right = helper(obstacleGrid,i,j+1,n,m ,dp);
        int down = helper(obstacleGrid,i+1,j,n,m,dp);
        return dp[i][j] = right+down;
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][] dp = new int[n][m];
        for(int [] arr : dp){
        Arrays.fill(arr,-1);
        }
        return helper(obstacleGrid,0,0,n,m,dp);
    }
}