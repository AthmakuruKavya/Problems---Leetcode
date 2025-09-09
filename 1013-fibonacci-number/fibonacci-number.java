import java.util.Scanner;
class Solution {
    public int fib(int n) {
        int a=0,b=1;
        if(n==0){
            return 0;
        }
        // if(n==2){
        //     return 1;
        // }
        int c=2;
        while(c<=n){
            int temp=b;
            b=a+b;
            a=temp;
            c++;
        }
        return b;
    }
}