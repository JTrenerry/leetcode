class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.getOrDefault(nums[i], 0) == 2) {
                map.remove(nums[i]);
            }
        }
        for (Map.Entry<Integer, Integer> m: map.entrySet()) {
            return m.getKey();
        }
        return 0;
    }
}
