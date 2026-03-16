class Solution {
    public boolean checkForSquare(char[][] board , int row , int col){
        Set<Character> set = new HashSet<>();
        for(int i = row; i< row +3 ; i++){
            for(int j = col; j < col+3; j++){
                if(board[i][j] == '.'){
                    continue;
                } else {
                    if(set.contains(board[i][j])){
                        return false;
                }
                set.add(board[i][j]);
            }
        }
        }
        return true;
    }
    public boolean checkForCol(char[][] board , int col){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i< 9 ; i++){
            if(board[i][col] == '.'){
                continue;
            } else {
                if(set.contains(board[i][col])){
                    return false;
                }
                set.add(board[i][col]);
            }
        }
        return true;
    }
    public boolean checkForRow(char[][] board , int row ){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i< 9 ; i++){
            if(board[row][i] == '.'){
                continue;
            } else {
                if(set.contains(board[row][i])){
                    return false;
                }
                set.add(board[row][i]);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i< 9; i++){
                if(!checkForCol(board,i)) return false;
                if(!checkForRow(board,i)) return false;
        }
        for(int i = 0; i< 9; i+=3){
            for(int j =0; j < 9; j+=3){        
                if(!checkForSquare(board,i,j)) return false;
            }
        } 
        return true;
    }
}