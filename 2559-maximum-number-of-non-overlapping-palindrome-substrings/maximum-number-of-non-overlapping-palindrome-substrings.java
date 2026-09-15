class Solution {
     int n ;
    public boolean isPalindrome(String s1){
        int l = 0 , r = s1.length()-1;
        while( l < r){
            if(s1.charAt(l) != s1.charAt(r)){
                return false;
            }
            l++ ;
            r--;
        }
        return true;
    }
    public int helper(String s , int k ,int i , int j , int[][] dp){
        if(i >= n || j >= n) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(isPalindrome(s.substring(i,j+1))){
            int take = 1 + helper(s,k,j+1,j+k,dp);
            int grow = helper(s,k,i,j+1,dp);
            int slide = helper(s,k,i+1,j+1,dp);
            return dp[i][j]=Math.max(take,Math.max(grow , slide));
        } 
            int grow = helper(s,k,i,j+1,dp);
            int slide = helper(s,k,i+1,j+1,dp);
            return dp[i][j]=Math.max(grow , slide);
        

    }
    public int maxPalindromes(String s, int k) {
        // int count = 0;
        // for(int i =0; i < s.length() ; i++){
        //     for(int j = i+k; j < s.length(); j++){
                
        //             if(isPalindromes(s.substring(i,j+1))){
        //                 count++;
        //                 i = j;
        //                 break;
        //             }
        //         }
        //     }
        
        //  return count;
         n = s.length();
        // int [][] dp = new int[n+1][n+1];
        // for(int [] a : dp) Arrays.fill(a,-1);
        // return helper(s,k,0,k-1 ,dp);
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Check length k first
            if (i + k <= n && isPalindrome(s.substring(i, i + k))) {
                count++;
                i = i + k - 1; // Jump past this palindrome
            } 
            // Otherwise check length k + 1
            else if (i + k + 1 <= n && isPalindrome(s.substring(i, i + k + 1))) {
                count++;
                i = i + k; // Jump past this palindrome
            }
        }

        return count;

    }
}