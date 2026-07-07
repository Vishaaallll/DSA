class Solution {
    public long sum(long v){
        long sum = 0; 
        while(v > 0){
            long digit = v % 10;
            v = v / 10;
            sum += digit;
        }
        return sum;
    }
    public long sumAndMultiply(int n) {
        if(n == 0){
            return 0;
        }
    String s = String.valueOf(n).replace("0" , "");
    long v = Long.parseLong(s);
        long sum1 = sum(v);
        return v * sum1;
    }
}