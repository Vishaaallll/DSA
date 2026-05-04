class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int top = 0 , bottom =n-1;
        while(top < bottom ){
            for(int c = 0; c < n ; c++){
                int temp = matrix[top][c];
                matrix[top][c] = matrix[bottom][c];
                matrix[bottom][c] = temp;
            }
            top ++;
            bottom--;
        }
        // Transpose of matrix
        for(int i=0; i<n; i++){
            for(int j = i+1; j< n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}