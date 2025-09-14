class Solution {
    public int reverse(int x) {
        int temp = x;
        int ab = 0;
        int res = 0;
        while (temp != 0) {
            ab = temp % 10;
            temp /= 10;
            if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = (res * 10) + ab;
        }
        return res;
    }
}