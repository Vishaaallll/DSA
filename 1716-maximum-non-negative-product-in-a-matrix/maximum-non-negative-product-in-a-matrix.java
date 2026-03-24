class Solution {
    public int maxProductPath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int MOD = 1_000_000_007;

        long[][] maxDP = new long[n][m];
        long[][] minDP = new long[n][m];
    
        maxDP[0][0] = grid[0][0];
        minDP[0][0] = grid[0][0];

        for (int i = 1; i < n; i++) {
            maxDP[i][0] = maxDP[i - 1][0] * grid[i][0];
            minDP[i][0] = minDP[i - 1][0] * grid[i][0];
        }

        for (int j = 1; j < m; j++) {
            maxDP[0][j] = maxDP[0][j - 1] * grid[0][j];
            minDP[0][j] = minDP[0][j - 1] * grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int val = grid[i][j];

                long p1 = maxDP[i - 1][j] * val; // From Top
                long p2 = minDP[i - 1][j] * val; // From Top
                long p3 = maxDP[i][j - 1] * val; // From Left
                long p4 = minDP[i][j - 1] * val; // From Left

                maxDP[i][j] = Math.max(Math.max(p1, p2), Math.max(p3, p4));
                minDP[i][j] = Math.min(Math.min(p1, p2), Math.min(p3, p4));
            }
        }
        long result = maxDP[n - 1][m - 1];
        if (result < 0) {
            return -1;
        }
        return (int) (result % MOD);
    }
}
