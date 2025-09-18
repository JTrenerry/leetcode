class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        int start = 0;
        Boolean chars = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && !chars) {
                end--;
            } else if (chars && s.charAt(i) == ' '){
                return end - start + 1;
            } else {
                chars = true;
                start = i;
            }
        }
        return end - start + 1;
    }
}
