class Solution {
    static class Pair{
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public static void bfs(int i , int j , char [][] grid , boolean [][] visited){
        int n = grid.length; int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        visited[i][j] = true;
        while (!q.isEmpty()){
            Pair f = q.remove();
            int row = f.row , col = f.col;
            // Checking for bottom
            if((row+1) < n){
                if(!visited[row+1][col] && grid[row+1][col] == '1'){
                    q.add(new Pair(row+1 , col));
                    visited[row+1][col] = true;
                }
            }
            // Checking for top
            if(row  > 0){
                if(!visited[row-1][col] && grid[row-1][col] == '1'){
                    q.add(new Pair(row-1 , col));
                    visited[row-1][col] = true;
                }
            }
            // Checking for Left
             if(col > 0){
                if(!visited[row][col-1] && grid[row][col-1] == '1'){
                    q.add(new Pair(row , col -1));
                    visited[row][col - 1] = true;
                }
             }    
            // Checking for Right
            if((col+1) < m){
                if(!visited[row][col+1] && grid[row][col+1] == '1'){
                    q.add(new Pair(row , col +1));
                    visited[row][col + 1] = true;
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visited = new boolean[n][m];
        int count = 0;
        for(int i =0; i<n; i++){
            for(int j = 0; j<m ; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    bfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count; 
    }
}