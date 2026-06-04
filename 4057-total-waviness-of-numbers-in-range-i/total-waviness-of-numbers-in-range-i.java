class Solution {
    public int noOfWaviness(int el ){
        if(el < 100) return 0;
        String s = Integer.toString(el);
        int c =0;
        for(int i = 1; i <= s.length()-2; i++){
            if((s.charAt(i) > s.charAt(i-1) && s.charAt(i) > s.charAt(i+1))|| (s.charAt(i-1) > s.charAt(i) && s.charAt(i+1) > s.charAt(i))){
                c++;
            }
        }
        return c;
    }
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int i = num1 ; i <= num2; i++){
            count += noOfWaviness(i);
        }
        return count;
    }
}