class Solution {
    public int missingInteger(int[] nums) {
        int sum = 0;
        if(nums.length == 1) return nums[0]+1;
        for(int i =1; i < nums.length; i++){
            sum += nums[i-1];
            if(nums[i-1]+1 != nums[i]) break;
            if(i== nums.length -1) sum += nums[nums.length -1];
        }
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        if(!set.contains(sum)) return sum;
        else {
            while(set.contains(sum)){
                sum++;
            }
            return sum;
        }
    }
}