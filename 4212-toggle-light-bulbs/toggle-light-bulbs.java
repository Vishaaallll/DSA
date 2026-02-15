class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int [] arr = new int[101];
        Arrays.fill(arr,0);
        for(int num : bulbs){
            if(arr[num] != 0){
                arr[num] =0;
            } else {
                arr[num] = 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=100; i++){
            if(arr[i] == 1){
                list.add(i);
            }
        }
        return list;
    }
}