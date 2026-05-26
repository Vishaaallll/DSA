class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for(char c : word.toCharArray()){
            set.add(c);
        }
        int [] freq = new int[26];
        for(char c : set){
            if(c >= 'A' && c <= 'Z'){
                freq[c -'A']++;
            } else {
                freq[c-'a']++;
            }
        }
        int count =0;
        for(int n : freq){
            if( n >= 2){
                count++;
            }
        }
        return count;
    }
}