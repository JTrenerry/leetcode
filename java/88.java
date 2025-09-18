class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int onePtr = m - 1;
        int twoPtr = n - 1;
        for (int i = m+n - 1; i > -1; i--) {
            if (onePtr < 0) {
                // All of nums1 has been added
                nums1[i] = nums2[twoPtr];
                twoPtr--;
                continue;
            } else if (twoPtr < 0) {
                // All of nums2 has been added
                nums1[i] = nums1[onePtr];
                onePtr--;
                continue;
            }

            if (nums1[onePtr] >= nums2[twoPtr]) {
                // nums1 is smaller
                nums1[i] = nums1[onePtr];
                onePtr--;
            } else if (nums1[onePtr] < nums2[twoPtr]) {
                // nums1 is smaller
                nums1[i] = nums2[twoPtr];
                twoPtr--;
            }
        }
    }
}
