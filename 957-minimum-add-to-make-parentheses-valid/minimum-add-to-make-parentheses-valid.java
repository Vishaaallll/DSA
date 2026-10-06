class Solution {
    public int minAddToMakeValid(String s) {
        int countOpen = 0;
        int count = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                countOpen++;
            } else if(s.charAt(i) == ')' && countOpen != 0) {
                countOpen--;
            } else if(s.charAt(i) == ')' && countOpen == 0){
                count++;
            }
        }
        return Math.abs(countOpen + count);
    }
}