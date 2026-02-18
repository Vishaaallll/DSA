class Solution {
    public int largestAltitude(int[] gain) {
      int maxAltitude = 0;
      int currAltitude =0 ;
      for(int num : gain){
            currAltitude += num;
            maxAltitude = Math.max(currAltitude,maxAltitude);
      }  
      return maxAltitude;
    }
}