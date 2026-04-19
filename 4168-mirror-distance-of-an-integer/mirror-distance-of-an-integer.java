class Solution {
    public int reverse(int n){
        int number = 0;

        while( n > 0){
            int digit = n % 10;
            number = (10 * number) + digit;
            n /= 10;
        }
        return number;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n -reverse(n));
    }
}