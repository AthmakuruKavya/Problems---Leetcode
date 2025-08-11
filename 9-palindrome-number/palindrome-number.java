class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // int num=x,sum=0;
        // while(x>0){
        //     int rem=x%10;
        //     sum=sum*10+rem;
        //     x=x/10;
        // }
        // return sum==num;

        String str = x + "";
        int si = 0;
        int ei = str.length() - 1;
        while (si <= ei) {
            if (str.charAt(si) != str.charAt(ei)) {
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
}