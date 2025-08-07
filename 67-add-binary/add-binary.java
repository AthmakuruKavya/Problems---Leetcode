import java.util.*;
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // long num1 = Long.parseLong(a, 2);
        // long num2 = Long.parseLong(b, 2);
        // if(num1==0 && num2==0){
        //     return "0";
        // }
        // long num3 = num1 + num2;
        // StringBuilder str = new StringBuilder();
        // while(num3 > 0){
        //     long r = num3%2;
        //     str.append(r);
        //     num3 = num3/2;
        // }
        // str.reverse();
        // return str.toString();

        // Parse binary strings into BigInteger
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        // Add the numbers
        BigInteger sum = num1.add(num2);

        // Convert the result back to binary string
        return sum.toString(2);

    }

}