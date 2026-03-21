class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] ans = new int[n][m];
        for(int i =0; i<n;i++){
            for(int j =0; j<m; j++){
                ans[i][j] = grid[i][j];
            }
        }
        int row = x + k -1;
        for(int i = x; i < x + k/2; i++){
            for(int j = y; j< y+k; j++){
                int temp =  ans[i][j];
                ans[i][j] = ans[row][j];
                ans[row][j] = temp; 
            }
            row--;
        }
        return ans;
    }
}