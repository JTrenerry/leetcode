class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] returnVal = new int[n * 2];
        for (int i = 0; i < n; i++) {
            returnVal[i] = nums[i];
            returnVal[i + n] = nums[i];
        }
        return returnVal;
    }
}
