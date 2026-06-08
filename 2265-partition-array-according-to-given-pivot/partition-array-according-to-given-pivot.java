class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        int count = 0;
        for(int ele : nums) {
            if(ele > pivot){
                ar2.add(ele);
            }
            if(ele < pivot){
                ar1.add(ele);
            }
            if(ele == pivot){
                count++;
            }
        }
        int n = nums.length;
        int [] res = new int[n];
        int i = 0;
        for(int ele : ar1){
            res[i++] = ele;
        }
        while( count > 0){
            res[i++] = pivot;
            count--;
        }

        for(int ele : ar2){
            res[i++] = ele;
        }
        return res;
    }
}