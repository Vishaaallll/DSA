class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        int dx = -1 , dy = -1;
        int [][] dp = new int[n][n];
        
        for(int k =0; k < n; k++){
            int i = 0 , j = k;
            while(j < n){
                if(i == j) {
                    dp[i][j] = 1;
                    if(max < j - i +1){
                        max = j -i +1;
                        dx = i;
                        dy = j;
                    }
                }
                 else if(i == j-1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 1;
                        if(max < j - i +1){
                        max = j -i +1;
                        dx = i;
                        dy = j;
                    }
                    }
                }   
                else if(s.charAt(i) == s.charAt(j)){
                    if(dp[i+1][j-1] == 1){
                        dp[i][j] = 1;
                        if(max < j - i +1){
                        max = j -i +1;
                        dx = i;
                        dy = j;
                    }
                    }
                }
                
                i++; j++;
            }
        }
        return s.substring(dx,dy+1);
    }
}