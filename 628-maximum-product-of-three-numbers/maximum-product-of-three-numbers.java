class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int firstSmall = nums[0] , secondSmall = nums[1];
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3] , firstSmall * secondSmall * nums[n-1]);
    }
}