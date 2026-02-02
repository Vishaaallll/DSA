class Solution {
    public int minimumCost(int[] nums) {
       PriorityQueue<Integer> q = new PriorityQueue<>();
       for(int i =1; i< nums.length; i++){
            q.add(nums[i]);
           
       }
       int totalsum = q.poll()+q.poll();
       
        return totalsum + nums[0];
    }    
}