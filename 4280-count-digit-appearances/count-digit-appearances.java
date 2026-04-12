class Solution {
    public int countDigit(int num , int digit){
        int noOfDigit = 0;
        while(num > 0){
            int d = num % 10;
            if(d == digit) noOfDigit++;
            num /= 10;
        }
        return noOfDigit;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int res = 0;
        for(int num : nums){
           res += countDigit(num , digit);
        }
        return res;
    }
}