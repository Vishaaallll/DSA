class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int [] ans = new int[n];
        Arrays.fill(ans,0);
        if(k == 0) return ans;
         for(int i =0; i< n ;i++){
            int sum =0;
             if(k > 0){
        
               for(int j = 0; j < k ; j++){
                 sum += code[(i+j+1) % n];
               }
               
            } else {

                for(int j = 1; j <= Math.abs(k); j++){
                 sum += code[(i-j+n) % n];
               }
               
            }
            ans[i] = sum;
        }
        return ans;
    }
}