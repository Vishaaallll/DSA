class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length , n = grid[0].length;
        int remainder = grid[0][0] % x;
        int median = 0;
        int [] flatten = new int[n*m];
        int k =0;
        for(int i =0; i < m; i++){
            for(int j =0; j < n; j++){
                if(grid[i][j] % x != remainder){
                    return -1;
                }
                flatten[k++] = grid[i][j];
            }
        }

        Arrays.sort(flatten);
        median = flatten[flatten.length / 2];
        int minOperation = 0;
        for(int i =0; i < m;i++){
            for(int j = 0; j < n;j++){
                 int diff = Math.abs(median -grid[i][j]);
                 minOperation += diff / x; 
            }
        }
        return minOperation;
    }
}