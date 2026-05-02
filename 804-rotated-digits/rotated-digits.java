class Solution {
    public boolean isGoodNum(int  i){
        boolean change = false;
        while( i > 0){
            int digit = i % 10;
            if(digit == 4 || digit == 3 || digit == 7) return false;
            if(digit == 2 || digit == 5 || digit == 6 || digit == 9) change = true;
            i /= 10;
        }
        return change;
    }
    public int rotatedDigits(int n) {
        int count = 0;
       for(int i =1; i <= n; i++){
            if(isGoodNum(i)){
                count++;
            }
       }
       return count;
    }
}