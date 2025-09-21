class Solution {
    public int firstUniqChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int val = map.get(ch);
            if(val == 1){
                return str.indexOf(ch);
            }
        }
        return -1;
    }
}