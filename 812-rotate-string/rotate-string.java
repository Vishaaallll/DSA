class Solution {
    
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(goal);
        int n = s.length();
        for(int i=0; i < n-1 ;i++){
            char c = s1.charAt(0);
            s1.deleteCharAt(0);
            s1.append(c);
            if(s1.toString().equals(goal)) return true;
            
            }
        return false;
        }
    }
