class Solution {
    public int reverse(int x) {
        long sum = 0;
        while(x!=0){
            int r = x%10;
            sum = sum*10+r;
            x = x/10;
        }
        if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)sum;

        

        // String a = Math.abs(x) + ""; 
        // long rev = 0;

        // long temp = Math.abs(x);
        // for (int i = a.length() - 1; i >= 0; i--) {
        //     int ld = (int) (temp % 10);
        //     long num = (long) Math.pow(10, i); 
        //     rev += num * ld;
        //     temp /= 10;
        // }

        // if (x < 0) {
        //     rev = -rev;
        // }

        // if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE) {
        //     return (int) rev;
        // }
        // return 0;


        // long temp = (long)x;
        // String a = Math.abs(x) + "";
        // long rev = 0;
        // for (int i = a.length() - 1; i >= 0; i--) {
        //     int num = (int) Math.pow(10, i);
        //     rev += num * (temp % 10);
        //     temp /= 10;
        // }
        // if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE) {
        //     return (int)rev;
        // }
        // return 0;
    }
}