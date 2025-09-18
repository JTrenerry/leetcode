class Solution {
    public boolean isPalindrome(int x) {
        String xs = String.valueOf(x);
        int start = 0;
        int end = xs.length() - 1;
        while (start <= end) {
            if (xs.charAt(start) != xs.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
