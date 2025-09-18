class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int val = 1;
        for (int j = 0; j < nums.length; j++) {
            int greater = 2;
            for (int i = j + 1; i < nums.length; i++) {
                if ((nums[i] > nums[i - 1] && (greater == 1 || greater == 2)) || (nums[i] < nums[i - 1] && (greater == 0 || greater == 2))) {
                    val = Math.max(val, i - j + 1);
                    if (nums[i] > nums[i - 1]) {
                        greater = 1;
                    } else {
                        greater = 0;
                    }
                } else {
                    break;
                }
            }
        }
        return val;
    }
}
