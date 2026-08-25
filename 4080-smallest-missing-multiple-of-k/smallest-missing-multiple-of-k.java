class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        for(int i = 1;i <200 ;i++){
            if(!set.contains(i*k)){
                return i * k;
            }
        }
        return -1;
    }
}