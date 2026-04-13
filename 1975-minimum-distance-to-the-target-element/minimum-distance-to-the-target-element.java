class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = 10001;
        for(int i =0; i< nums.length; i++){
            if(nums[i] == target){
                int x = Math.abs(i -start);
                min = Math.min(x ,min);
            }
        }
        return min;
    }
}