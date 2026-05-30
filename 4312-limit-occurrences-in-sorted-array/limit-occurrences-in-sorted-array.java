class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
       if (nums.length <= k) {
            return nums;
        }

        int index = k; // The write pointer

        for (int i = k; i < nums.length; i++) {
            if (nums[i] != nums[index - k]) {
                nums[index] = nums[i];
                index++;
            }
        }

        int[] result = new int[index];
        System.arraycopy(nums, 0, result, 0, index);
        
        return result;
    }
}