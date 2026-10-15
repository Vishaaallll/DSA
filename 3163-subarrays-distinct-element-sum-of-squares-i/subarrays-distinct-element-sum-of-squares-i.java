class Solution {
    public int sumCounts(List<Integer> nums) {
        long sum = 0;
        for(int i =0; i< nums.size(); i++){
            HashSet<Integer> distinctElement = new HashSet<>();
            for(int j = i; j < nums.size(); j++){
                distinctElement.add(nums.get(j));
                int distinctCount = distinctElement.size();             
                sum += (long)distinctCount * distinctCount;
            }
        }
        return (int)sum;
    }
}