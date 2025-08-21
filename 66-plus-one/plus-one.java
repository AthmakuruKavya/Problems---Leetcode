import java.util.*;
import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] arr) {
         String str = "";
        for(int i=0;i<arr.length;i++){
            str += arr[i];
        }
        BigInteger num = new BigInteger(str);
        num = num.add(BigInteger.ONE);
        String br = num+"";
        int[] brr = new int[br.length()];
        for(int i=0;i<brr.length;i++){
            brr[i] = br.charAt(i) - '0';
        }
        return brr;
    }
}


// class Solution {
//     public int[] plusOne(int[] digits) {
//         String str = "";
//         for(int i=0; i<digits.length; i++){
//             str+=digits[i];
//         }
//         BigInteger bigNum = new BigInteger(str);
//         bigNum = bigNum.add(BigInteger.ONE);
//         str = bigNum.toString();
//         int[] arr = new int[str.length()];
//         for(int i=0; i<str.length(); i++){
//             arr[i] = str.charAt(i)-'0';
//         }
//         return arr;

//     }
// }