class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();        
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i = 2;
        while(i < n){
            int num = nums[i];
            if(arr1.get(arr1.size() -1) > arr2.get(arr2.size()-1)){
                arr1.add(num);
            } else{
                arr2.add(num);
            }
            i++;
        }
        int [] res = new int[n];
        int j = 0;
        for(int k : arr1){
            res[j++] = k;
        }
         for(int k : arr2){
            res[j++] = k;
        }
        return res;
    }
}