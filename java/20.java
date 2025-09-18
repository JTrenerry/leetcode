class Solution {
    public boolean isValid(String s) {
        Stack stk = new Stack();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // Check if it is a pop or a push
            if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                try {
                    if (stk.pop() != maps(s.charAt(i))) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            } else {
                stk.push(s.charAt(i));
            }
        }
        if (stk.size() != 0) {
            return false;
        }
        return true;
    }

    public Character maps(Character c) {
        if (c == ']') {
            return '[';
        } else if (c == '}') {
            return '{';
        } else {
            return '(';
        }
    }
}
