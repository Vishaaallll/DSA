class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        int count = 0;
        for(int n  : nums){
            int v = k - n;
            if(map.getOrDefault(v,0) > 0){
                count++;
                map.put(v,map.get(v)-1);
            } else {
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        return count;
    }
}