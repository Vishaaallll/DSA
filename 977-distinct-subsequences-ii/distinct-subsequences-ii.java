class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
       int [] end = new int[26];
       int total = 0;
       for(char c : s.toCharArray()){
           int index = c - 'a';

           int oldTotal = total;

           int newSequence = (oldTotal + 1 - end[index] + MOD) % MOD;

           total = (newSequence + total) % MOD;

           end[index] = (end[index] + newSequence) % MOD;

       }
       return total;
    }
}