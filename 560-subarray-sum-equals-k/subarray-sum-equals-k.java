class Solution {
    public int subarraySum(int[] arr, int target) {
         HashMap<Integer ,Integer> hashmap = new HashMap<>();
        int sum = 0;
        int count = 0;
        hashmap.put(0 , 1);
        for(int i =0; i < arr.length; i++){
            sum += arr[i];
            if(hashmap.containsKey(sum - target)){
                count += hashmap.get(sum - target);
            }
            hashmap.put(sum,hashmap.getOrDefault(sum , 0)+1);
        }
        return count;
    }
}