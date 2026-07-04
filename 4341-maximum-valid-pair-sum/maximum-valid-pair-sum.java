class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int maxI = Integer.MIN_VALUE;
        for(int j = k; j < nums.length; j++){
            maxI = Math.max(maxI , nums[j-k]);

            int currSum = maxI + nums[j];
            max = Math.max(max , currSum);
            
        }
        return max;
    }
}