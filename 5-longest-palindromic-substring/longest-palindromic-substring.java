class Solution {
    public boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = s.substring(0, 1);
        for(int i =0; i<n; i++){
            for(int j= i+1; j <= n;j++){
                String res = s.substring(i,j);
                if(isPalindrome(res)){
                    if(res.length() > ans.length())
                     ans = res;
                }
            }
        }
        return ans;
    }
}