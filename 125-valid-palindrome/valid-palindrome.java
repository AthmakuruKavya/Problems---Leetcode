class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch >= '0' && ch <= '9')){
                str = str+ch;
            }
        }
        int si = 0;
        int ei = str.length()-1;
        while(si <= ei){
            if(str.charAt(si) != str.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
}