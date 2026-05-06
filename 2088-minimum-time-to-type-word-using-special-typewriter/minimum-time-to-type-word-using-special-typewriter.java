class Solution {
    public int minTimeToType(String word) {
        char p = 'a';
        int time =0;
        for(int i =0; i < word.length(); i++){
            char c = word.charAt(i);
            int clockwise = Math.abs(c- p);
            int anticlockwise = 26 - clockwise;
            time += Math.min(clockwise , anticlockwise) + 1;
            p = c;
        }
        return time;
    }
}