class Solution {
    public String makeGood(String s) {
        boolean changed = true;
        StringBuilder sb = new StringBuilder(s);
        while (changed) {
            changed = false;
            for (int i = 0 ; i < sb.length() - 1; i++) {
                if (Character.toLowerCase(sb.charAt(i)) == Character.toLowerCase(sb.charAt(i + 1)) && sb.charAt(i) != sb.charAt(i + 1)) {
                    changed = true;
                    sb = sb.deleteCharAt(i).deleteCharAt(i);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
