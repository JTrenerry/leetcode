class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int val = 0;
        int amount = tickets[k];
        for (int i =0; i < tickets.length; i++) {
            if (k == i) {
                val += amount;
            } else if (tickets[k] <= tickets[i]) {
                val += amount -1;
                if (k > i) {
                    val++;
                }
            } else {
                val += tickets[i];
            }
        }
        return val;
    }
}
