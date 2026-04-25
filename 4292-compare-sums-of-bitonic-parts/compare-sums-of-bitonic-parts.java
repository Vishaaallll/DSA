class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        long ascendingPart = 0 , descendingPart = 0 ;
        int i =0;
         while(nums[i] < nums[i+1]){
            ascendingPart += nums[i];
            i++;
        }
        ascendingPart += nums[i];
        while(i < n){
            descendingPart += nums[i];
            i++;
        }
        
        if(ascendingPart == descendingPart) return -1;
        return ascendingPart > descendingPart ? 0 : 1;
    }
}