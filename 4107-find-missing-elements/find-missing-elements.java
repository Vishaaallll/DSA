class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 101;
        int max = -1;
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int element : nums){
            set.add(element);
            max = Math.max(element ,max);
            min = Math.min(element , min);
        }
        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}