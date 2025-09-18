class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Object index;
        int indexCounter = 0;
        for(int number: nums) {
            index = map.get(target - number);
            if (index != null) {
                int[] returnVal = {(Integer) index, indexCounter};
                return returnVal;
            }
            map.put(number, indexCounter);
            indexCounter++;
        }
        return null;
    }
}
