class Solution {
    public int maxDistance(int[] colors) {
        int maxDist = -1;
        for(int i =0; i<colors.length -1; i++){
            for(int j = i+1; j < colors.length; j++){
                if(colors[i] != colors[j]){
                    maxDist = Math.max(maxDist , Math.abs(i-j));
                }
            }
        }
        return maxDist;
    }
}