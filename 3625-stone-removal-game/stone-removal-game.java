class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10) return false;
        int i = 10;
        while(n >= i){
            
            n -= i;
            
            i--;
            
        }
        return i % 2 != 0;
    }
}