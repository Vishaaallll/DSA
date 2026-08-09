class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(discounts);
        Arrays.sort(prices);
        double mincost = 0;
        int i = prices.length-1 , j = discounts.length -1;
        while(i >= 0 && j >= 0){
            double p = prices[i];
            double d = discounts[j];
            mincost += (p * (100 - d)) / 100;
            i--;
            j--;
        }
        if(j == 0){
            return mincost;
        } else {
            while(i>=0){
                mincost += prices[i];
                i--;
            }
            return mincost;
        }
    }
}