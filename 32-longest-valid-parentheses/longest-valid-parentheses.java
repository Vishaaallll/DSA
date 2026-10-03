class Solution {
    public int longestValidParentheses(String s) {
        
        int n = s.length();
        if(n==0) return 0;
        int count = 0;
        Stack <Integer> st = new Stack <>();
        st.push(-1);
        for(int i =0 ; i<n; i++){
            char c = s.charAt(i);
              if(c == '('){
                st.push(i);
                
            } else {
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                } else {
                   int len =  i - st.peek();
                    count = Math.max(len , count);
                }
                }
            }
        
        return count;
    }
}