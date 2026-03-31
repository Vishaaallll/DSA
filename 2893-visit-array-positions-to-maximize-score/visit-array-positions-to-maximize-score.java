class Solution {
    public long maxScore(int[] nums, int x) {
        long dpEven = (nums[0] % 2 == 0) ? nums[0] : (long) -1e14;
        long dpOdd = (nums[0] % 2 != 0) ? nums[0] : (long) -1e14;
        for(int i =1 ; i<nums.length; i++){
            int val = nums[i];
            if(val % 2 == 0){
                dpEven = Math.max(dpEven + val , dpOdd + val - x);
            } else {
                dpOdd = Math.max(dpOdd + val , dpEven + val -x);
            }
        }
        return Math.max(dpEven , dpOdd);
    }
}