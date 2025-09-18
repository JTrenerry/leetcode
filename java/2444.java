class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long returnVal = 0;
        int max = -1;
        int min = -1;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxK || nums[i] < minK) {
                max = -1;
                min = -1;
                start = i + 1;
            }
            if (nums[i] == minK) {
                min = i;
            }
            if (nums[i] == maxK) {
                max = i;
            }
            returnVal += Math.max(0, Math.min(min, max) - start + 1);
        }
        return returnVal;
    }
}
