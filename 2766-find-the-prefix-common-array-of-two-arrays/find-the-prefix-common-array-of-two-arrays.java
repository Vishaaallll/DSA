class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] ans = new int [n];
        int [] freq = new int[51];
        int i = 0 , count=0;
        while(i < n){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                count++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                count++;
            }
            ans[i] = count;
            i++;
        }
        return ans;
    }
}