class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length - 1;
        for (int i = size; i >= 0; i--) {
            if (digits[i] + 1 < 10) {
                digits[i] = digits[i] + 1;
                return digits;
            } else if (i - 1 >= 0 && digits[i] + 1 >= 10) {
                digits[i] = 0;
            } else {
                // shuffle time
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                newArray[1] = 0;
                for (int j = 1; j < newArray.length - 1; j++) {
                    newArray[j + 1] = digits[j];
                }
                return newArray;
            }
        }
        return null; //never happens
    }
}
