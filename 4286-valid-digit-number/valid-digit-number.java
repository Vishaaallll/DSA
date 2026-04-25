class Solution {
    public boolean validDigit(int n, int x) {
        int count = 0;
        int firstDigit = 0;
        while( n > 0){
            int digit = n % 10;
            if(digit == x) count++;
         
            if(n < 10) firstDigit = n;

            n /= 10;
        }
        

        return count  > 0 && firstDigit != x;
    }
}