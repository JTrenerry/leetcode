class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int smallest = -1;
        for (int i = 0; i < nums.length; i++) {
            int orNum = 0;
            for (int j = i; j < nums.length; j++) {
                orNum = orNum | nums[j];
                if (orNum >= k && (smallest == -1 || smallest > j - i + 1)) {
                    smallest = j - i + 1;
                }
            }
        }
        return smallest;
    }
}
