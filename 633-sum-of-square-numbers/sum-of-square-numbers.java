class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while(i <= j){
            long res = (long)i*i + (long)j*j;
            if(res == c){
                return true;
            } else if(res > c){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}