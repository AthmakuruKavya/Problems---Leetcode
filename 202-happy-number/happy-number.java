class Solution {
    public boolean isHappy(int val) {
        int sum=val;
        while(sum!=1 && sum!=4){
            sum=digitsquares(sum);
        }
        return sum==1;
    }
    public int digitsquares(int n){
        int s=0;
        while(n>0){
            int r=n%10;
            s=s+r*r;
            n=n/10;
        }
        return s;
    }
}