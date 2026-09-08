class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int currSum = 0;
        int[] prefixCounts = new int[nums.length + 1];
        prefixCounts[0] = 1; // Base case for prefix sum 0

        for (int num : nums) {
            currSum += (num % 2 != 0) ? 1 : 0;
            if (currSum >= goal) {
                count += prefixCounts[currSum - goal];
            }
            prefixCounts[currSum]++;
        }

        return count; 
    }
}