class Solution {
     public int helper(int [] nums , int goal){
        if(goal < 0) return 0;
        int count = 0;
        int sum = 0;
        int r = 0 , l = 0;
        while(r < nums.length){
            sum += nums[r] % 2;
            while(sum > goal){
                sum -= nums[l] %2;
                l++;
            }
            count += r -l + 1;
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
    //    int sum = 0;
    //    int count = 0;
    //    HashMap<Integer , Integer> map = new HashMap<>();
    //    map.put(0,1);
    //    for(int n : nums){
    //       sum += (n % 2 != 0) ? 1 : 0;
    //       if(map.containsKey(sum - k)){
    //         count += map.get(sum - k);
    //       }
    //       map.put(sum , map.getOrDefault(sum , 0)+1);
    //    }
    //    return count;
        
        return helper(nums,k) - helper(nums,k-1);

    }
}