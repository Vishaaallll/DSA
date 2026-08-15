class Solution {
    // public int helper(int i , int count , int currXor , int [] nums){
    //     if(i== nums.length) return currXor != 0 ? count : 0;
    //     int pick =  helper(i+1, count+1,currXor ^ nums[i], nums);
       
    //     int skip = helper(i+1 , count,currXor, nums);
    //     return Math.max(pick , skip);
    // }
    public int longestSubsequence(int[] nums) {
     //   return helper(0,0,0,nums);
     int totalXor = 0;
        boolean hasNonZero = false;

        for (int num : nums) {
            totalXor ^= num;
            if (num != 0) {
                hasNonZero = true;
            }
        }

        if (!hasNonZero) return 0;          
        if (totalXor != 0) return nums.length; 
        return nums.length - 1;
    }
}