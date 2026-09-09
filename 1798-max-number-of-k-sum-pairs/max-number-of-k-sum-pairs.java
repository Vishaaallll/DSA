class Solution {
    public int maxOperations(int[] nums, int k) {
        // HashMap<Integer , Integer> map = new HashMap<>();
         int count = 0;
        // for(int n  : nums){
        //     int v = k - n;
        //     if(map.getOrDefault(v,0) > 0){
        //         count++;
        //         map.put(v,map.get(v)-1);
        //     } else {
        //         map.put(n,map.getOrDefault(n,0)+1);
        //     }
        // }
        // return count;
        Arrays.sort(nums);
        int right = nums.length -1 , left = 0;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == k){
                left++;
                right--;
                count++;
            }else if( sum < k){
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}