class Solution {
    public int digitRange(int n){
        int maxD = Integer.MIN_VALUE;
        int minD = Integer.MAX_VALUE;
        while(n > 0){
            int d = n % 10;
            maxD = Math.max(maxD,d);
            minD = Math.min(minD,d);
            n /= 10;
        }
        return maxD - minD;
    }
    public int maxDigitRange(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int [] range = new int[nums.length];
        for(int i =0; i < nums.length; i++){
            int digitRange = digitRange(nums[i]);
            max = Math.max(max , digitRange);
            range[i] = digitRange;
        }
        for(int i =0; i < nums.length; i++){
            if(range[i] == max){
                sum += nums[i];
            }
        }
        return sum;
    }
}