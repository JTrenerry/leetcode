class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ')') {
                if (st.size() == 0) {
                    sb.deleteCharAt(i);
                    i--;
                } else {
                    st.pop();
                }
            } else if (sb.charAt(i) == '('){
                st.push(i);
            }
        }
        while (st.size() > 0) {
            sb.deleteCharAt(st.pop());
        }
        return sb.toString();
    }
}
