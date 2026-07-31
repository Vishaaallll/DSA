class Solution {
    // public int helper(int i , int j , int home_i , int home_j, int [] rowCosts , int [] colCosts , int m , int n){
    //     if(i== home_i &&  j == home_j) return 
    //     if(i > m || j > n || i < 0 || j < 0) return 0;

    //     int left = colCosts[j-1] + Math.

    //}
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int i = startPos[0] , j = startPos[1];
        int home_i = homePos[0] , home_j = homePos[1];
        int min = 0;
        int m = rowCosts.length , n = colCosts.length;
        if(home_i > i){
           for(int r = i +1; r <= home_i; r++){
               min += rowCosts[r];
           }
        } else {
            for(int r = i-1; r >= home_i; r--){
                min += rowCosts[r];
            }
        }
        if(home_j > j){
            for(int c = j +1; c <= home_j; c++){
                min += colCosts[c];
            }
        } else {
            for(int c = j-1; c >= home_j; c--){
                min += colCosts[c];
            }
        }
        return min;
    }
}