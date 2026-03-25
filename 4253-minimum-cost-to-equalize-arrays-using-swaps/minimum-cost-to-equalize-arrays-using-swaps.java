class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n = nums1.length;
        HashMap<Integer , Integer > hm1 = new HashMap<>();
        HashMap<Integer , Integer> hm2 = new HashMap<>();
        HashMap<Integer , Integer> hm3 = new HashMap<>();
        int i =0;
        while(i < n){
            hm1.put(nums1[i], hm1.getOrDefault(nums1[i] , 0)+1);
            hm1.put(nums2[i], hm1.getOrDefault(nums2[i] , 0)+1);
            hm2.put(nums1[i], hm2.getOrDefault(nums1[i] , 0)+1);
            hm3.put(nums2[i], hm3.getOrDefault(nums2[i] , 0)+1);
            i++;
        }
        for(int element : hm1.values()){
            if(element % 2 != 0) return -1;
        }
        int minCost = 0;
        
        for (int key : hm2.keySet()) {
            int targetFrequency = hm1.get(key) / 2;
            int currentFrequency = hm2.get(key);
            
            if (currentFrequency > targetFrequency) {
                minCost += (currentFrequency - targetFrequency);
            }
        }
        return minCost;
    }
}