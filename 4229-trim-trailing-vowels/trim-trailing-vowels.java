class Solution {
    public  boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
    public String trimTrailingVowels(String s) {
        
        int i = s.length()-1;
        if(!isVowel(s.charAt(i))) return s;
        while(i>=0 && isVowel(s.charAt(i))){
                i--;
        } 
        return s.substring(0,i+1);
    }
}