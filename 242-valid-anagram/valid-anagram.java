class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] freq = new int[26];
        for(int i =0;i < t.length(); i++){
            char c = t.charAt(i);
            freq[c - 'a']++;
        }
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch -'a'] == 0) return false;
            freq[ch - 'a']--;
        }
        return true;
    }
}