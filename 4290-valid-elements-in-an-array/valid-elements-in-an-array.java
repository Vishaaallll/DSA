class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        if (n == 0) return list;
        if (n == 1) {
            list.add(nums[0]);
            return list;
        }
        int [] leftmax = new int[n]; 
        leftmax[0] = Integer.MIN_VALUE;
        for(int i = 1 ; i < n; i++){
            leftmax[i] = Math.max(leftmax[i-1], nums[i -1]);
        }

        int [] rightmax = new int[n];
        rightmax[n-1] = Integer.MIN_VALUE;
        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(rightmax[i+1],nums[i+1]);
        }
        for(int i =0; i < n; i++){

            if (i == 0 || i == n - 1) {
                list.add(nums[i]);
            }

            else if(leftmax[i] < nums[i] || rightmax[i] < nums[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}