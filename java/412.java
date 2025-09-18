class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> returnVal = new ArrayList<String>();
        for (int i = 1; i < n + 1; i++) {
            String output = "";
            if (i % 3 == 0) {
                output = output.concat("Fizz");
            }
            if (i % 5 == 0) {
                output = output.concat("Buzz");
            }
            if (output == "") {
                output = Integer.toString(i);
            }
            returnVal.add(output);
        }
        return returnVal;
    }
}
