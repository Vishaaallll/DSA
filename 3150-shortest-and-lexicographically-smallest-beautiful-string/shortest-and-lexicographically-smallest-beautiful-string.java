class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0 , j = 0;
        int countOne = 0;
        int minLen = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();
        while(j < s.length()){
            if(s.charAt(j)=='1') countOne++;

            while(countOne == k){
                if(s.charAt(i)=='1'){
                    int currLen = j - i +1;
                    if(currLen < minLen ){
                        minLen = currLen;
                        list.clear();
                        list.add(s.substring(i,j+1));
                    } else if (currLen == minLen) {
                        list.add(s.substring(i,j+1));
                    }
                    countOne--;
                }
                i++;
            }
            j++;
        }
        if(list.isEmpty()) return "";
        Collections.sort(list);
        return list.get(0);
    }
}