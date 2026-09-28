class Solution {
    public int maxDepth(String s) {
        int max = 0;
        Stack <Character> stack = new Stack<>();
        int i = 0 , n = s.length();
        while(i < n){
            char c = s.charAt(i);
            if(c == ')'){
                stack.pop();
                max = Math.max(max , stack.size() +1);
            } else if( c == '('){
                stack.push(c);
            }else{
                 i++;
                continue;
            }
            i++;
        }
        return max;
    }
}