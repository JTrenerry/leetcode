class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<= 1) return 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int next = i;
            int prod = 1;
            while (next < nums.length) {
                if (prod * nums[next] < k) {
                    prod = prod * nums[next];
                    next++;
                    count++;
                } else {break;}
            }
        }
        return count;
    }
}
