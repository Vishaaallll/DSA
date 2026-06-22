class Solution {
    public int rearrangeCharacters(String s, String target) {

        int [] sfreq = new int [26];
        int [] tFreq = new int[26];

        for(int i =0; i <s.length(); i++){
            char c = s.charAt(i);
            sfreq[c - 'a']++;
        }
        for (int i = 0; i < target.length(); i++) {
            tFreq[target.charAt(i) - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        for(int i =0; i < 26; i++){
           if (tFreq[i] > 0) {
            min = Math.min(min , sfreq[i] / tFreq[i]);
           }
        }
        return min;
    }
}