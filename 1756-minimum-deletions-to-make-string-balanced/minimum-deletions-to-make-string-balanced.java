class Solution {
    public int minimumDeletions(String s) {
       
        int countB = 0;
        int n= s.length();
        int deletion = 0;
        for(int i =0; i< n ; i++){
            if(s.charAt(i)=='b'){
                countB++;
            } else{
                deletion = Math.min(deletion+1 , countB);
            }
        }
           
     return deletion;   
    }
}