class Solution {
    public int reverse(int x) {
        // long sum = 0;
        // while(x>0 || x<0){
        //     int r = x%10;
        //     sum = sum*10+r;
        //     x = x/10;
        // }
        // if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
        //     return 0;
        // }
        // return (int)sum;

            // String a = Math.abs(x) + "";
            // long rev = 0;
            // for (int i = a.length() - 1; i >= 0; i--) {
            //     int ld = x % 10;
            //     int num = (int) Math.pow(10, i);
            //     rev += num * ld;
            //     x /= 10;
            // }
            //  if ((rev <= Integer.MAX_VALUE) && (rev >= Integer.MIN_VALUE)){
            //     return (int)rev;
            //  }
            // return 0;

            String a = Math.abs((long)x) + ""; // use long to avoid overflow on abs
        long rev = 0;

        long temp = Math.abs((long)x); // work with positive number
        for (int i = a.length() - 1; i >= 0; i--) {
            int ld = (int)(temp % 10); // extract last digit
            long num = (long)Math.pow(10, i); // place value
            rev += num * ld;
            temp /= 10;
        }

        // apply original sign
        if (x < 0) {
            rev = -rev;
        }

        // check if within int range
        if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE) {
            return (int)rev;
        }
        return 0;
    }
}