class Solution {
    public int[] concatWithReverse(int[] nums) {
        int  n = nums.length;
        int [] ans = new int[2*n];
        int right = ans.length -1;
        for(int i =0; i < n ;i++){
            ans[i] =nums[i];
            ans[right--] = nums[i];
        }
        return ans;
    }
}