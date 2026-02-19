class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer , Integer> hashmap = new HashMap<>();
        for(int num : nums){
            hashmap.put(num , hashmap.getOrDefault(num ,0)+1);
        }
        HashMap<Integer , Integer> hashmap2 = new HashMap<>();
        for(int num : hashmap.values()){
            hashmap2.put(num , hashmap2.getOrDefault(num ,0)+1);
        }
        for(int num : nums){
            if(hashmap2.get(hashmap.get(num)) == 1 ){
                return num;
            }
        }
        return -1;
    }
}