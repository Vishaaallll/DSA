class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y =0;
        int underscore = 0;
        for(int i =0; i < moves.length(); i++){
            char c = moves.charAt(i);
            if( c == 'L') x += -1;
            else if(c == 'R') x += 1;
            else if(c == 'U') y += 1;
            else if(c == 'D') y += -1;
            else underscore++;
        }
        return Math.abs(x) + Math.abs(y) + underscore;
    }
}