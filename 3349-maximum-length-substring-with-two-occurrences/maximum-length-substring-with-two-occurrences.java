class Solution {
    public int maximumLengthSubstring(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
        int i =0 , j = 0;
        int max =Integer.MIN_VALUE;
        while(j < s.length()){
            char c = s.charAt(j);
            map.put(c,map.getOrDefault(c , 0)+1);

                while(map.get(c) > 2){
                    char leftChar = s.charAt(i);
                    map.put(leftChar,map.get(leftChar)-1);
                    i++;
                }
        
           
            max = Math.max(j-i+1, max);
            j++;
        }
        return max;
    }
}