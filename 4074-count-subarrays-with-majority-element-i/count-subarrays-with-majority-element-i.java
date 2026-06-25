class Solution {
    //int count = 0;
    // public void majority(int i , int j , int x , int [] nums){
    //     int c = 0;
    //     int len = j - i +1;
    //     while(i <= j){
    //         if(nums[i] == x){
    //             c++;
    //         }
    //         i++;
    //     }
    //     if(c  > len / 2){
    //         count++;
    //     }
    // }
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for(int i =0; i < nums.length; i++){
            int targetCount = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j]==target){
                    targetCount++;
                }
                int len = j - i + 1;
                if(targetCount > len / 2){
                    count++;
                }
                
            }
        }
        return count;
    }
}