class Solution {
    public int passThePillow(int n, int time) {
        int v=1;
        int m=1;
        while (time > 0) {
            v+=m*1;
            time--;
            if (v == n || v == 1) {
                m *=-1;
            }
        }
        return v;
    }
}
