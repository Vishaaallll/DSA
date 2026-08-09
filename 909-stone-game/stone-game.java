class Solution {
    // int [][] dp;
    // public int helper(int i ,int j , int arr[]){
    //     if(i > j) return 0;
    //     if(dp[i][j] != -1) return dp[i][j];
    //     int start = arr[i] + Math.min(helper(i+2 , j , arr) , helper(i+1,j-1,arr));
    //     int end = arr[j] + Math.min(helper(i,j-2,arr) , helper(i+1, j-1,arr));
    //     return dp[i][j] = Math.max(start ,end);
    // }
    
     public boolean stoneGame(int[] piles) {
    //     int total = 0;
    //     for(int n : piles){
    //         total += n;
    //     }
    //     int n = piles.length;
    //     dp = new int[n][n];
    //     for(int i =0; i < n; i++) Arrays.fill(dp[i] ,-1);
    //     int Alice = helper(0,piles.length -1 , piles);
    //     int Bob = total - Alice;
    //     return Alice >= Bob ? true : false;
     return true;
    }
}