class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i =0; i < s.length() -1 ; i++){
            int val = (s.charAt(i) - '0') - (s.charAt(i+1) - '0');
            if(Math.abs(val) > 2){
                return false;
            }
        }
        return true;
    }
}