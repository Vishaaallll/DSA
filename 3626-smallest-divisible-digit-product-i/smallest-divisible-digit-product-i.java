class Solution {
    public int digitProductFn(int n){
        int d = 1;
        while(n > 0){
            int v = n % 10;
            d *= v;
            n /= 10;
        }
        return d;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            int digitProduct = digitProductFn(n);
            if(digitProduct % t ==0){
                return n;
            }
            n++;
        }
        //return -1;
    }
}