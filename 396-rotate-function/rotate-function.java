class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int numSum = Arrays.stream(nums).sum();
        int f =0;
        for(int i =0; i < n; i++){
            f += i * nums[i];
        }
        int maxRotation = f;
        for(int i = n-1; i >= 0 ; i--){
            f += numSum - n * nums[i];
            maxRotation = Math.max(maxRotation , f);
        }
        return maxRotation;
    }
}