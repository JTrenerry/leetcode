class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        List<Integer> list = new ArrayList();
        String number = String.valueOf(x);
        for(int i = 0; i < number.length(); i++) {
            list.add(Character.digit(number.charAt(i), 10));
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }
}
