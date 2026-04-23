class Solution {
    public void dfs(int i , int j , char [][] grid , boolean [][] visited){
    int n = grid.length , m = grid[0].length;
        visited[i][j] = true;
        if(i >0 && grid[i][j] == '1' && !visited[i-1][j])
           dfs(i-1,j, grid,visited);
        if(i+1 < n && grid[i][j] == '1' && !visited[i+1][j])
            dfs(i+1,j,grid,visited);
        if(j >0 && grid[i][j] == '1' && !visited[i][j-1])
            dfs(i,j-1,grid,visited);
        if( j +1 < m && grid[i][j] == '1' && !visited[i][j+1])
            dfs(i,j+1,grid,visited);
    }
    
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visited = new boolean[n][m];
        int count = 0;
        for(int i =0; i<n; i++){
            for(int j = 0; j<m ; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count; 
    }
}