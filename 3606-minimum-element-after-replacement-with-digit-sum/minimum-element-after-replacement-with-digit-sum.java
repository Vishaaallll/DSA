class Solution {
    public int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int  min = 10001;
        for(int n : nums){
            min = Math.min(min , digitSum(n));
        }
        return min;
    }
}