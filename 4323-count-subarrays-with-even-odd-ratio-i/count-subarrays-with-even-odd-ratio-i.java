class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int NoOfSubArray = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int Even = 0 , Odd = 0;
            for(int j = i; j < n ;j++){
                if(nums[j] % 2 == 0 ) Even++;
                else Odd++;
                // int ratio = Even / Odd;
                // try{
                //     return  Even / Odd;
                // } catch (Exception e) {
                //     return 0;
                // }
                if(Odd > 0 && (b * Even <= a *Odd)) NoOfSubArray++;
            }
        }
        return NoOfSubArray;
    }
}