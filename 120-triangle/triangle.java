class Solution {
    // public int mini(List<List<Integer>> tr, int i , int j ,int[][] dp){
    //     if(i == tr.size()-1 ) return tr.get(i).get(j);
    //     if(dp[i][j] != -1) return dp[i][j];
    //     int down = tr.get(i).get(j) + mini(tr,i+1,j,dp);
    //     int left = tr.get(i).get(j) + mini(tr , i+1 , j+1,dp);
    //     return dp[i][j]=Math.min(down,left);
        
    // }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [][] dp = new int [n][n];
        for(int [] a: dp) Arrays.fill(a,-1);
       // return mini(triangle,0,0,dp);
    
        for(int i = n-1; i >= 0; i--){
            dp[n-1][i] = triangle.get(n-1).get(i);
        }
        for(int i = n-2; i >=0; i--){
            for( int j = i; j >= 0; j--){
                int down = triangle.get(i).get(j) + dp[i+1][j];
                int left = triangle.get(i).get(j) + dp[i+1][j+1];
                dp[i][j]=Math.min(down,left);
            }
        }
        return dp[0][0];
    }
}