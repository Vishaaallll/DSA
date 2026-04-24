class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int L =0 , R =0 , underScore = 0;
        for(char c : moves.toCharArray()){
            if(c == 'R') R++;
            else if( c == 'L') L++;
            else underScore++;
        }
        return Math.abs( L - R) + underScore;
    }
}