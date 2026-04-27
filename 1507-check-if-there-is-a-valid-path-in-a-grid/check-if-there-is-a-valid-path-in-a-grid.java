class Solution {

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];   
        return helper(0, 0, m, n, grid, visited);   
    }

    private boolean helper(int i, int j, int m, int n, int[][] grid, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= m || j >= n) return false;
        if (visited[i][j]) return false;

        visited[i][j] = true;

        if (i == m - 1 && j == n - 1) return true;

        int l = grid[i][j];

        if (goesLeft(l)  && j > 0   && goesRight(grid[i][j-1])  && helper(i, j-1, m, n, grid, visited)) return true;
        if (goesRight(l) && j < n-1 && goesLeft(grid[i][j+1])   && helper(i, j+1, m, n, grid, visited)) return true;
        if (goesUp(l)    && i > 0   && goesDown(grid[i-1][j])   && helper(i-1, j, m, n, grid, visited)) return true;
        if (goesDown(l)  && i < m-1 && goesUp(grid[i+1][j])     && helper(i+1, j, m, n, grid, visited)) return true;

        return false;
    }

    private boolean goesLeft(int t)  { 
        return t==1 || t==3 || t==5; 
    }
    private boolean goesRight(int t) {
        return t==1 || t==4 || t==6;
    }
    private boolean goesUp(int t)    { 
        return t==2 || t==5 || t==6; 
    }
    private boolean goesDown(int t)  { 
        return t==2 || t==3 || t==4;
    }
}