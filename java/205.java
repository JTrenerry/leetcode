class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.getOrDefault(s.charAt(i), t.charAt(i)) != t.charAt(i)) {
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }

        Set set = new HashSet(map.values());
        if (map.values().size() != set.size()) {
            return false;
        }
        return true;
    }
}
