class Solution {
    public int intReverse(int n){
        long reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return (int) reversed;
    }
    public int minMirrorPairDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        Map<Integer , Integer > map = new HashMap<>();
        for(int j =0; j < nums.length; j++){
            int currNum = nums[j];
            if(map.containsKey(currNum)){
                min = Math.min( min , j - map.get(currNum));
            }
            int target = intReverse(currNum);
            map.put(target , j);
        } 

        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}