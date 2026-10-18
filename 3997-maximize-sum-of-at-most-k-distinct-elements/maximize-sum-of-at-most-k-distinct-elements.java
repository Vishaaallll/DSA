class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> uniqueNums = new TreeSet<>(Collections.reverseOrder());
        for (int num : nums) {
            uniqueNums.add(num);
        }
        
        int size = Math.min(k, uniqueNums.size());
        int[] result = new int[size];
        
        int index = 0;
        for (int num : uniqueNums) {
            if (index == size) break;
            result[index++] = num;
        }
        
        return result;
    }
}