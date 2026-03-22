class Solution {
    public boolean isMatch(int [][] mat , int [][] target){
        int n = mat.length;
        int m = mat[0].length;
        for(int i =0; i< n; i++){
            for(int j =0; j<m ;j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean rotateMatrix(int[][] mat, int[][] target){
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
            }
        }
        return isMatch(mat,target);
    }
    
    public boolean findRotation(int[][] mat, int[][] target) {
        if(isMatch(mat,target)) return true;
        boolean flag = false;
        for(int i =0; i< 4; i++){
            flag = rotateMatrix(mat,target);
            if(flag == true) return flag;
        }
        return flag;
    }
}