class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            int product = (i+1) * (26 -(c - 'a'));
            sum += product;
            i++;
        }
        return sum;
    }
}