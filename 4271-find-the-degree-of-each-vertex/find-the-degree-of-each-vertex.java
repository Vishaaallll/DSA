class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int [] res = new int[n];
        int i =0; 
        for(int [] arr : matrix){
            int sum = 0;
            for(int j = 0; j <arr.length; j++){
                sum += arr[j];
            }
            res[i++] = sum;
        }
        return res;
    }
}