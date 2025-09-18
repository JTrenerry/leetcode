
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helpMe(nums, k) - helpMe(nums, k - 1);
    }

    public int helpMe(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int left = 0;
        int right = 0;
        int returnVal = 0;

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            returnVal += right - left + 1;
            right++;
        }
        return returnVal;
    }
}
