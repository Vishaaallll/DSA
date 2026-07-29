class Solution {
    public int minOperations(int n) {
       int i = n / 2;
       int res = 0;
       int mid = (1 + ((2* n-1) + 1))/2;
       while( i < n){
            res += Math.abs(mid - (2*i + 1));
            i++;
       }
       return res;
    }
}