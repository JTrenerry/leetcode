class Solution {
    public int tribonacci(int n) {
        if (n<=1){return n;}
        if (n==2){return 1;}
        
        Map<Integer, Integer> m = new HashMap();
        m.put(0,0);
        m.put(1,1);
        m.put(2,1);
        return find(n, m);
    }

    public int find(int n, Map<Integer, Integer> m) {
        int c = m.getOrDefault(n, -1);
        if (c != -1) {
            return c;
        }
        int v = find(n - 1, m) + find(n - 2, m) + find(n - 3, m);
        m.put(n, v);
        return v;
    }
}
