class Solution {
    public int minOperations(int[] nums, int x) {
        // int sum = Arrays.stream(nums).sum();
        int sum = 0;
        for(int num : nums){
            sum+= num;
        }
        if(sum < x) return -1;
        int target = sum - x , tarSum = 0;
        int maxLen = -1;
        int j =0;
        int n = nums.length;
        for(int i =0; i < n; i++){
            tarSum += nums[i];
            while(tarSum > target){
                 tarSum -= nums[j];
                 j++;
            }
            if(tarSum == target){
                maxLen = Math.max(maxLen , i - j +1);
            }
        }
        
        return maxLen == -1 ? -1 : n - maxLen;
    }
}