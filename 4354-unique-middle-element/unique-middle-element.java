class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int ele = nums[n/2];
        int count = 0;
        for(int element : nums){
            if(ele == element){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}