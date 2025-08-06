class Solution {
    public boolean isSubsequence(String s, String t) {
        int se = 0;
        for(int i=0; i<s.length(); i++){
            boolean status = false;
            for(int j=se; j<=t.length()-1; j++){
                if(s.charAt(i) == t.charAt(j)){
                    se = j+1;
                    status = true;
                    break;
                }
            }
            if(!status){
                return false;
            }
        }
        return true;
    }
}