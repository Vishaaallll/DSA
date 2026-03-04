class Solution {
    public boolean checkBinary(int i , int j , int [][] mat){
        int n = mat.length;
        int m = mat[0].length;
        for (int r = 0; r < n; r++) {
            if (r != i && mat[r][j] == 1) {
                return false;
            }
        }
        for (int c = 0; c < m; c++) {
            if (c != j && mat[i][c] == 1) {
                return false;
            }
        }
        
        return true;
    }
    public int numSpecial(int[][] mat) {
        int count = 0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == 1){
                 if(checkBinary(i , j ,  mat)) count++;
                }
            }
        }
        return count;
    }
}