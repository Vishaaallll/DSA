class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n%2 !=0) return false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            } else if (c == '{') {
                st.push(c);
            } else if (c == '[') {
                st.push(c);
            } else {
                if (st.size() == 0) return false;
                if (st.peek() == '(' && c == ')') {
                    st.pop();
                    
                } else if (st.peek() == '{' && c =='}') {
                    st.pop();
                } else if (st.peek() == '[' && c == ']') {
                    st.pop();
                } else {
                        return false;
                    }
               }
            }
            if (st.size() > 0) return false;
            return true;

    }
        
    }
