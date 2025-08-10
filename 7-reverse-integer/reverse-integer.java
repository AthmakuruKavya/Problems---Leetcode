class Solution {
    public int reverse(int x) {
        long temp = (long)x;
        String a = Math.abs(x) + "";
        long rev = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int num = (int) Math.pow(10, i);
            rev += num * (temp % 10);
            temp /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
       return (int)rev;
    }
}