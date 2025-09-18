class Solution {
    public String longestCommonPrefix(String[] strs) {
        String returnVal = "";
        String curr;
        for (int i = 0; i < 201; i++) {
            curr = null;
            for (String str: strs) {
                if (str.length() <= i) {
                    return returnVal;
                }
                if (curr == null) {
                    curr = str.substring(0, i + 1);
                } else if (!curr.equals(str.substring(0, i + 1))) {
                    return returnVal;
                }
            }
            returnVal = curr;
        }
        return returnVal;
    }
}
