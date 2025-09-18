class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sq = 0;
        int ci = 0;
        for (int student : students) {
            if (student == 1) {
                ci++;
            } else {
                sq++;
            }
        }
        for (int sandwich : sandwiches) {
            if (sandwich == 1 && ci > 0) {
                ci--;
            } else if (sandwich == 0 && sq > 0) {
                sq--;
            } else {
                return ci + sq;
            }
        }
        return 0;
    }
}
