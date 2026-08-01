class Solution {
    public int helper(int i ,int j , int arr[]){
        if(i > j) return 0;
        
        int start = arr[i] + Math.min(helper(i+2 , j , arr) , helper(i+1,j-1,arr));
        int end = arr[j] + Math.min(helper(i,j-2,arr) , helper(i+1, j-1,arr));
        return Math.max(start ,end);
    }
    public boolean predictTheWinner(int[] nums) {
        int total = 0;
        for(int n : nums){
            total += n;
        }
        int player1 = helper(0,nums.length -1 , nums);
        int player2 = total - player1;
        return player1 >= player2 ? true : false;
    }
}