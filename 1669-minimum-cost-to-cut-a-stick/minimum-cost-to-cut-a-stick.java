class Solution { 
    public int minCost1(int i , int j , int [] arr ,int [][] dp){
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int mini = Integer.MAX_VALUE;
        for(int idx = i; idx <= j; idx++){
            int cost = arr[j+1] - arr[i-1] + minCost1(i,idx-1,arr,dp) + minCost1(idx+1 ,j,arr,dp);
            mini = Math.min(mini , cost);
        }
        return dp[i][j] = mini;
    }
    public int minCost(int n, int[] cuts) {
        int v = cuts.length;
        int [] arr = new int[v+2];
        arr[0] = 0;
        arr[arr.length -1] = n;
        for(int i = 0; i<v; i++){
            arr[i+1] = cuts[i];

        }
        Arrays.sort(arr);
        int [][] dp = new int [v+2][v+2];
        for(int [] r : dp) Arrays.fill(r,-1);
        return minCost1(1,v,arr,dp);
    }
}