class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int ele : nums){
            max = Math.max(max,ele);
            min = Math.min(min,ele);
        }
        int s = max- min;
        return (long) s*k;
    }
}