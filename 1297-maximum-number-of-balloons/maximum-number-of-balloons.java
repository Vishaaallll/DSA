class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int [] freq = new int[26];
        for(int i =0; i <text.length(); i++){
            freq[text.charAt(i) - 'a']++;
        }
        freq['l' - 'a'] /= 2;
        freq['o'-'a'] /= 2;
        String s = "balon";
        if(text.length() < s.length()) return 0;
        int min = Integer.MAX_VALUE;
        for(int i =0; i < s.length(); i++){
            min = Math.min(freq[s.charAt(i) - 'a'] , min);
        }
        return min;
    }
}