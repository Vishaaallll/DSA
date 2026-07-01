class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0;
        int l  = 0;
        int u = 0;
        int d = 0;
        for(char c : moves.toCharArray()){
            if(c == 'R'){
                r++;
            } else if(c == 'L'){
                l++;
            } else if(c =='U'){
                u++;
            } else {
                d++;
            }
        }
        if(r == l && u == d){
            return true;
        } 
        return false;
    }
}