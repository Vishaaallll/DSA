class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int idx = 0 , sum = 0;
        for(int i=n-1; i >= 0; i--){
            idx++;
            if( idx % 3 == 0){
                continue;
            } 
            sum += cost[i];      
        }
        return sum;
    }
}