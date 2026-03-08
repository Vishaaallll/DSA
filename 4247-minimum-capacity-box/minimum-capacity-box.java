class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int bestIndex = -1;
        int minCapacity = Integer.MAX_VALUE;
        
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize) {
                if (capacity[i] < minCapacity) {
                    minCapacity = capacity[i];
                    bestIndex = i;
                }
            }
        }
        
        return bestIndex;
    }
}