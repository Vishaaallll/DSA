class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = -1 , j = -1;
        int n = nums.length;
        for(int k = 0; k < n; k++){
            if(nums[k] > max){
                max = nums[k];
                i = k; 
            }
            if(nums[k] < min){
                min = nums[k];
                j = k;
            }
        }
        int cost = 0;
        // Remove from front
        int c1 = Math.max(i+1,j+1);
        // Remove from back
        int c2 = Math.max((n -i) , (n-j));
        // Remove from both side
        int c3 ;
        if(i < j){
            c3 = (i+1)+(n-j);
        } else {
            c3 = (j+1)+(n-i);
        }
        return Math.min(c1,Math.min(c2,c3));
    }
}