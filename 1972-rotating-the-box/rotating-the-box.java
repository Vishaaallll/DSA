class Solution {
    public char[][] rotate(char[][] res) {
       int n = res.length;
       int m = res[0].length;
       char [][] res1 = new char[m][n];
       for(int i =0; i < n; i++){
           for(int j =0; j < m; j++){
                res1[j][n-1-i] = res[i][j];
          }
       }
       return res1;
    }
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;
        int m = boxGrid[0].length;
        char [][] res = new char[n][m];
        for(char [] arr : res) Arrays.fill(arr,'.');
        for(int i = n-1; i >= 0; i--){
            int pointer = m-1;
            for(int j = m-1; j >= 0; j--){
                if(boxGrid[i][j] == '#'){
                    res[i][pointer--] = '#';
                } else if(boxGrid[i][j] == '*'){
                    res[i][j] = '*';
                    pointer = j -1;
                } else {
                   continue;
                }
            }
        }
       
        return rotate(res);
    }
}