class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        
        // If k is a multiple of total, the grid remains unchanged
        k = k % total;
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // Find the 1D index of the current cell in the new grid
                int current1DIndex = i * n + j;
                
                // Find where this element came from in the original unshifted grid
                int original1DIndex = (current1DIndex - k + total) % total;
                
                int origRow = original1DIndex / n;
                int origCol = original1DIndex % n;
                
                row.add(grid[origRow][origCol]);
            }
            result.add(row);
        }
        
        return result;
    }
}