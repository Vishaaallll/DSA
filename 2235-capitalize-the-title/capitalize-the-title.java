class Solution {
    public String capitalizeTitle(String title) {
        char[] chars = title.toCharArray();
        int n = chars.length;
        
        for (int i = 0; i < n; ) {
            int j = i;
            
            // Traverse the current word and convert all characters to lowercase
            while (j < n && chars[j] != ' ') {
                chars[j] = Character.toLowerCase(chars[j]);
                j++;
            }
            
            // If the word length is greater than 2, capitalize the first letter
            if (j - i > 2) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            
            // Move 'i' to the start of the next word (skip the space)
            i = j + 1; 
        }
        
        return new String(chars);
    }
}