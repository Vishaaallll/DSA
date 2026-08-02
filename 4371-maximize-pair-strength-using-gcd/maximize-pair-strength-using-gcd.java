class Solution {
    public int gcd(int a ,int b){
        if(b == 0) return a;
        int c = a % b;
       return gcd(b,c);
    }
    public long maxPairStrength(int[] nums) {
       long max = Long.MIN_VALUE;
       int n = nums.length;
       for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                long g = gcd(nums[i],nums[j]);
                long pair = ((long)nums[i] * nums[j])/(g*g);
                max = Math.max(pair,max);
            }
       } 
       return max;
    }
}