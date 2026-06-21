class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int numberOfIceCream = 0;
        int currCoins = coins;
        for(int i =0; i < costs.length; i++){
            if(currCoins < costs[i]){
                break;
            } else {
                currCoins -= costs[i];
                numberOfIceCream ++;
            }
        }
        return numberOfIceCream;
    }
}