class Solution {

    public boolean isGroup1(int row , Map<Integer, Set<Integer>> map){
        Set<Integer> reserved = map.get(row);
        if(reserved == null){
            return true;
        }
        return !reserved.contains(2) && !reserved.contains(3) && 
           !reserved.contains(4) && !reserved.contains(5);
     } 
    public boolean isGroup2(int row , Map<Integer, Set<Integer>> map){
        Set<Integer> reserved = map.get(row);
        if(reserved == null){
            return true;
        }
        return !reserved.contains(6) && !reserved.contains(7) && 
           !reserved.contains(4) && !reserved.contains(5);
     } 
     public boolean isGroup3(int row , Map<Integer, Set<Integer>> map){
        Set<Integer> reserved = map.get(row);
        if(reserved == null){
            return true;
        }
        return !reserved.contains(6) && !reserved.contains(8) && 
           !reserved.contains(9) && !reserved.contains(7);
     } 
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int maxNumber = 0 ;
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for(int [] p : reservedSeats){
            int row = p[0];
            int seat = p[1];
            map.computeIfAbsent(row, k -> new HashSet<>()).add(seat);
        }
        int result = (n-map.size()) * 2;
        Set<Integer> set = map.keySet();
        for(int i : set){
            if(isGroup1(i,map) && isGroup3(i,map)){
                result += 2;
            }
            else if(isGroup1(i,map) || isGroup2(i,map) || isGroup3(i,map)){
                result += 1;
            }
        }
        return result;
    }
}