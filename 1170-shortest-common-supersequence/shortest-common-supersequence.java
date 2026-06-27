class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int [][] dp = new int[n+1][m+1];
        for(int i =1 ; i <= n; i++){
            for(int j =1; j <=m ; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                } else {
                    dp[i][j] =Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
       int i = n , j = m;
       while( i > 0 && j > 0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));
               i--;
               j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            } else {
                j--;
            }
        }
        sb.reverse();
        StringBuilder res = new StringBuilder();
         i =0 ; j = 0 ; 
         int k = 0;
        while(i < n && j < m && k < sb.length()){
            while(i < n && str1.charAt(i) != sb.charAt(k)){
                res.append(str1.charAt(i));
                i++;
            }
            while( j < m && str2.charAt(j) != sb.charAt(k)){
                res.append(str2.charAt(j));
                j++;
            }
            if(str1.charAt(i) == sb.charAt(k) && str2.charAt(j)== sb.charAt(k)){
                res.append(sb.charAt(k));
                k++;
                i++;
                j++;
            }
        }
        while( i != n){
            res.append(str1.charAt(i));
            i++;
        }
        while( j != m){
            res.append(str2.charAt(j));
            j++;
        }
        return res.toString();
    }
}