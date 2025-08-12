class Solution {
    public int reverseBits(int n) {
        String binaryNum = Integer.toBinaryString(n);
        int bits = 32-binaryNum.length();
        String bitsZ = "0".repeat(bits);
        String binaryStr = bitsZ+binaryNum;
        String rev = "";
        for(int i = binaryStr.length()-1; i>=0; i--){
            rev += binaryStr.charAt(i);
        }
        int num = Integer.parseInt(rev,2);

        return num;

        // int reversed = 0;

        // for (int i = 0; i < 32; i++) {
        //     reversed <<= 1;
        //     reversed |= (n & 1);
        //     n >>= 1;
        // }

        // return reversed;

    }
}