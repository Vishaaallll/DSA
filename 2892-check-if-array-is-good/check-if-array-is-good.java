class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n < 2) return false;
        
        int expected = n-1;
        if(expected != nums[n-1]) return false;

        for(int i =0; i < n -1; i++){
            if(nums[i] != i+1){
               if (i == n - 2 && nums[i] == expected) {
                   continue;
                }
            return false;
            }
        }
        return nums[n-1] == expected;
    }
}