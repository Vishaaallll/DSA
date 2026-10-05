class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Integer> stack = new Stack<>();
        stack.push(0);
        int i = 0;
        while(i < s.length()){
            char  c = s.charAt(i);
            if(c == '('){
                stack.push(0);
               
            } else {
                int innerScore = stack.pop();
                int outerScore = stack.pop();

                int curr = Math.max(2 * innerScore , 1);
                stack.push(outerScore + curr);
            }
            i++;
        }
        return stack.pop();
    }
}