class Solution {
    public int largestPrime(int n) {
        int sum1 =0 ;
        int sum2 = 0;
        for(int i=2; i<=n ;i++){
            if(isPrime(i)){
                sum1 = sum1+i;
                if(isPrime(sum1) && sum1<=n){
                    sum2 = sum1;
                }else{
                    if(sum1>n){
                        return sum2;
                    }
                }
                
            }
        }
        return sum2;
        
    }
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}