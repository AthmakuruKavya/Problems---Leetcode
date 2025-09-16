class Solution {
    public int mostWordsFound(String[] s) {
        int count = 0;
        for(int i=0; i<s.length; i++){
            int val = words(s[i], 0);
            if(val>count){
                count=val;
            }
        }
        return count;
    }
    static int words(String s, int c){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                c++;
            }
        }
        return c+1;
    }
}