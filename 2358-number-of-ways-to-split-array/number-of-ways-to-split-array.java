class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long [] prefixSum = new long[n];
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        long [] suffixSum = new long[n];
        suffixSum[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            suffixSum[i] = suffixSum[i+1] + nums[i];
        }

        int count = 0;

        for(int i =0; i < n-1; i++){
            if(prefixSum[i] >= suffixSum[i+1]){
                count++;
            }
        }
        return count;
    }
}