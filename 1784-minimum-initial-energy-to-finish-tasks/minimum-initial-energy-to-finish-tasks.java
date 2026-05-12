class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> {
            int diff1 = a[1] - a[0];
            int diff2 = b[1] - b[0];

            return diff2 - diff1;
        });

        int minEnergy = 0 , currEnergy =0;
        for(int [] arr : tasks){
            int minReq = arr[1] , EnergyReq = arr[0];
            if(currEnergy < minReq){
                minEnergy += minReq - currEnergy;
                currEnergy += minReq - currEnergy;
            }
            currEnergy -= EnergyReq;
        }
        return minEnergy;
    }
}