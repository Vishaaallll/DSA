class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int a : nums){
            total += a;
        }
        int prefix = 0;
        //total -= nums[0];
        for(int i = 0;i<nums.length; i++){
            if(prefix == total-nums[i]){
                return i;
            }
            prefix += nums[i];
            total -= nums[i];
        }
        return -1;
    }
}