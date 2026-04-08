class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        long MOD = 1_000_000_007L;
        for(int [] arr : queries){
            int li = arr[0];
            int ri = arr[1];
            int ki = arr[2];
            int vi = arr[3];
            while(li <= ri){
                nums[li] = (int)((1L * nums[li] * vi) % MOD);
                li  += ki;
            }
        }
        int res = 0;
        for(int i =0; i< nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}