class Solution {
    public int romanToInt(String s) {
        int value = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                if (i + 1 <= s.length() - 1) {
                    if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                        value--;
                        continue;
                    }
                }
                value++;
            } else if (s.charAt(i) == 'V') {
                value += 5;
            } else if (s.charAt(i) == 'X') {
                if (i + 1 <= s.length() - 1) {
                    if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                        value -= 10;
                        continue;
                    }
                }
                value += 10;
            } else if (s.charAt(i) == 'L') {
                value += 50;
            } else if (s.charAt(i) == 'C') {
                if (i + 1 <= s.length() - 1) {
                    if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                        value -= 100;
                        continue;
                    }
                }
                value += 100;
            } else if (s.charAt(i) == 'D') {
                value += 500;
            } else if (s.charAt(i) == 'M') {
                value += 1000;
            }
        }
        return value;
    }
}
