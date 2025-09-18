class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        // Find the biggest value
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        int count = 0;
        int i = 0;
        int j = 0;
        long returnVal = 0;
        // Search the array for the max, if found inc count
        while (j < nums.length){
            if (nums[j] == max){
                count++;
            }
            // You can add all the rest of the array as a subarray if the condition is already met
            while (count >= k){
                // the rest of the array
                returnVal += nums.length - j;
                // Makes the count smaller so this loop stops once you find another max
                // It will add to the returnVal when the other loop reaches it
                if (nums[i] == max){
                    count--;
                }
                i++;
            }
            j++;
        }
        return returnVal;
    }
}
