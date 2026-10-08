class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0 , openBraket = 0;
        for(int j = 0; j <s.length(); j++){
            if(s.charAt(j) == '('){
                openBraket++;
            } else {
                openBraket--;
                if(openBraket == 0){
                    String s1 = s.substring(i+1,j);
                    i = j+1;
                    sb.append(s1);
                }
            }
        }
        return sb.toString();
    }
}