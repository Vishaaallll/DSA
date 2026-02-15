class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean [] arr = new boolean[101];
        
        for(int num : bulbs){
            if(arr[num]){
                arr[num] = false;
            } else {
                arr[num] = true;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=100; i++){
            if(arr[i] == true){
                list.add(i);
            }
        }
        return list;
    }
}